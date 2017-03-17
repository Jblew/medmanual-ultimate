package pl.jblew.mm.generator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import pl.jblew.mm.adnotacje.Comment;
import pl.jblew.mm.dist.BłądWStrukturzeException;
import pl.jblew.mm.dist.MedmanualThrowable;

@GeneratorSkip
public class GenericParser {

	private GenericParser() {
	}

	public static String parseAnnotations(Annotation[] annotations) {
		String out = "";

		for (Annotation a : annotations) {
			if (a.annotationType().equals(Comment.class)) {
				out += "<small>" + ((Comment) a).text() + "</small>";
			}
		}

		return out;
	}

	public static String parseMethod(Method m, Object instance) {
		if (m.getDeclaringClass().equals(Object.class))
			return "";
		if (m.isAnnotationPresent(GeneratorSkip.class))
			return "";

		String out = "";

		out += "<h3>" + m.getName() + "</h3>";
		out += parseAnnotations(m.getAnnotations());
		try {

			Object res = m.invoke(instance);
			if (res.getClass().isArray()) {
				if (((Object[]) res).length > 0) {
					out += "<ul>";
					for (Object elem : ((Object[]) res)) {
						out += "<li>" + elem + "</li>";
					}
					out += "</ul>";
				} else {
					out += "<p>Pusta tablica</p>";
				}
			} else {
				out += "<p>" + res + "</p>";
			}
		} catch (IllegalArgumentException e) {
			out += "<p>" + e.toString() + "</p>";
		} catch (IllegalAccessException e) {
		} catch (InvocationTargetException e) {
			out += "<p>" + e.getCause().toString() + "</p>";
		}

		return out;
	}

	public static String parseMethodsExcept(Class<?> clazz, Object instance, String[] skipMethodNames) {
		List<String> skipMethodsList = Arrays.asList(skipMethodNames);
		String out = "";
		for (Method m : clazz.getMethods()) {
			if (!skipMethodsList.contains(m.getName()))
				out += parseMethod(m, instance);
		}
		return out;
	}

	public static Object findBestInstance(Class<?> clazz) {
		if (clazz.isAnnotationPresent(GeneratorSkip.class))
			return null;

		Object instance = null;

		try {
			Field f = clazz.getField(clazz.getSimpleName());
			if (!(Modifier.isStatic(f.getModifiers()) && Modifier.isFinal(f.getModifiers()))) {
				throw new BłądWStrukturzeException(
						"Klasa " + clazz.getName() + " posiada pole instancji, ale nie jest ono statyczne i finalne.");
			}
			instance = f.get(null);
		} catch (NoSuchFieldException | SecurityException e) {
			throw new BłądWStrukturzeException("Klasa "
					+ clazz.getName()
					+ " nie ma adnotacji @GeneratorSkip, ani nie posiada pola statycznego zawierającego instancję");
		} catch (IllegalArgumentException e) {
			throw new BłądWStrukturzeException("Klasa " + clazz.getName() + ".PoleStatyczne: " + e);
		} catch (IllegalAccessException e) {
			throw new BłądWStrukturzeException("Klasa " + clazz.getName() + ".PoleStatyczne: " + e);
		}

		return instance;
	}

	public static String parseClass(Class<?> clazz, Map<Class<?>, ClassLink> links) {
		return parseClass(clazz, links, 0);
	}

	public static String parseClass(Class<?> clazz, Map<Class<?>, ClassLink> links, int level) {
		System.out.println("Parsing class " + clazz.getName());
		long prevTime = System.currentTimeMillis();
		String out = "<h" + (level + 1) + ">" + clazz.getSimpleName() + "</h\"+(level+1)+\">";
		out += "<h" + (level + 2) + ">" + clazz.getName() + "</h" + (level + 2) + ">";

		out += parseAnnotations(clazz.getAnnotations());

		// System.out.println("Parsing annotations: " +
		// (System.currentTimeMillis() - prevTime) + "ms");
		prevTime = System.currentTimeMillis();

		try {

			Object instance = findBestInstance(clazz);

			// System.out.println("Finding instance: " +
			// (System.currentTimeMillis() - prevTime) + "ms");
			prevTime = System.currentTimeMillis();

			if (instance instanceof SelfParsing) {
				out += ((SelfParsing) instance).parse();

				// System.out.println("Self parsing: " +
				// (System.currentTimeMillis() - prevTime) + "ms");
				prevTime = System.currentTimeMillis();
			} else {
				System.out.println("Not SelfParse class: "
						+ clazz.getName()
						+ ". Instance.class()="
						+ instance.getClass().getName());
				for (Method m : clazz.getMethods()) {
					out += parseMethod(m, instance);
				}
				// System.out.println("Automatic parsing: " +
				// (System.currentTimeMillis() - prevTime) + "ms");
				prevTime = System.currentTimeMillis();
			}

			for (Class<?> memberClass : clazz.getClasses()) {
				// otherwise sibiling member classes own each other
				if (memberClass.getEnclosingClass().equals(clazz)) {
					out += "<blockquote>";
					// System.out.println(clazz.getSimpleName() + " has member:
					// " + memberClass.getSimpleName());
					out += parseClass(memberClass, links, level + 1);
					out += "</blockquote>";
				}
			}

			if (clazz.getClasses().length > 0) {
				// System.out.println("Parsing members: " +
				// (System.currentTimeMillis() - prevTime) + "ms");
				prevTime = System.currentTimeMillis();
			}

		} catch (IllegalArgumentException | SecurityException e) {
			out += "<p>" + e.toString() + "</p>";
		} catch (MedmanualThrowable e) {
			out += "<p>" + e.toString() + "</p>";
		} catch (Exception e) {
			out += "<p>" + e.toString() + "</p>";
			System.out.println("Here: " + e.toString());
		}

		return out;
	}

	public static String getLink(Class<?> clazz) {
		return "{>" + clazz.getName() + "<}";
	}

	private static final Pattern linkPattern = Pattern.compile("\\{>([^<]+)<\\}", Pattern.UNICODE_CHARACTER_CLASS);

	public static String resolveLinks(String document, Map<Class<?>, ClassLink> links, ClassLink relative) {
		Path me = Paths.get(relative.getRelativePath()).getParent();

		Matcher m = linkPattern.matcher(document);
		while (m.find()) {
			String clazzName = m.group(1);
			try {
				Class<?> clazz = Class.forName(clazzName);
				if (clazz.isMemberClass()) {
					Class<?> enclosing = clazz.getEnclosingClass();
					String path = me.relativize(Paths.get(links.get(enclosing).getRelativePath())).toString();
					document = document.replace("{>" + clazzName + "<}", "<a href=\""
							+ path
							+ "#"
							+ clazz.getSimpleName()
							+ "\">"
							+ enclosing.getSimpleName()
							+ ".."
							+ clazz.getSimpleName()
							+ "</a>");
				} else {
					String path = me.relativize(Paths.get(links.get(clazz).getRelativePath())).toString();
					document = document.replace("{>" + clazzName + "<}",
							"<a href=\"" + path + "\">" + clazz.getSimpleName() + "</a>");
				}
			} catch (ClassNotFoundException e) {
				document = document.replace("{>" + clazzName + "<}",
						"<a href=\"#\" class=\"text-danger\">" + clazzName + " ?</a>");
			}
		}
		return document;
	}
}
