package pl.jblew.mm.generator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import pl.jblew.mm.adnotacje.Comment;
import pl.jblew.mm.dist.MedmanualThrowable;

@GeneratorSkip
public class ClassLink {
	private final Class<?> clazz;
	private final String relativePath;

	public ClassLink(Class<?> clazz, String relativePath) {
		super();
		this.clazz = clazz;
		this.relativePath = relativePath;
	}

	public String getRelativePath() {
		return relativePath;
	}

	public String getHtml() {
		String content = "<h1>" + clazz.getSimpleName() + "</h1>";
		content += "<h2>" + clazz.getName() + "</h2>";

		content += parseAnnotations(clazz.getAnnotations());

		try {
			Constructor<?> constructor = clazz.getDeclaredConstructor();
			constructor.setAccessible(true);
			Object instance = constructor.newInstance();

			for (Method m : clazz.getMethods()) {
				content += parseMethod(m, instance);
			}

		} catch (InvocationTargetException | IllegalArgumentException | SecurityException | NoSuchMethodException
				| InstantiationException | IllegalAccessException e) {
			content += "<p>" + e.toString() + "</p>";
		} catch (MedmanualThrowable e) {
			content += "<p>" + e.toString() + "</p>";
		} catch (Exception e) {
			content += "<p>" + e.toString() + "</p>";
			System.out.println("Here: " + e.toString());
		}

		return HtmlGenerator.toHtml(clazz.getName(), content);
	}

	private String parseMethod(Method m, Object instance) {
		if (m.getDeclaringClass().equals(Object.class))
			return "";
		String out = "";

		out += "<h3>" + m.getName() + "</h3>";
		out += parseAnnotations(m.getAnnotations());
		try {
			out += "<p>" + m.invoke(instance) + "</p>";
		} catch (IllegalArgumentException e) {
			out += "<p>" + e.toString() + "</p>";
		} catch (IllegalAccessException e) {
		} catch (InvocationTargetException e) {
			out += "<p>" + e.getCause().toString() + "</p>";
		}

		return out;
	}

	private String parseAnnotations(Annotation[] annotations) {
		String out = "";

		for (Annotation a : clazz.getAnnotations()) {
			if (a.annotationType().equals(Comment.class)) {
				out += "<small>" + ((Comment) a).text() + "</small>";
			}
		}

		return out;
	}
}
