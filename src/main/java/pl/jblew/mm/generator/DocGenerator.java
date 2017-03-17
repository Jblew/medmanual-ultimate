package pl.jblew.mm.generator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

import org.apache.commons.io.FileUtils;

@GeneratorSkip
public class DocGenerator {
	private final File rootDir;
	private final File jarFile;
	private final Class<?> rootClass;

	public DocGenerator(String path, File jarFile, Class<?> rootClass) {
		this.rootDir = new File(path);
		this.jarFile = jarFile;
		this.rootClass = rootClass;
	}

	public void generate() throws IOException, ClassNotFoundException {
		if (rootDir.exists()) {
			FileUtils.deleteDirectory(rootDir);
		}
		if (!rootDir.mkdirs())
			throw new IOException("Could not create dirs");

		List<Class<?>> classes = this.loadAndScanJar(jarFile);
		Map<Class<?>, ClassLink> links = new ClassParser().parse(classes);

		for (ClassLink cl : links.values()) {
			String treeCode = TreeGenerator.getTreeHtml(links, cl);
			File path = new File(rootDir.getPath() + "/" + cl.getRelativePath());
			path.getParentFile().mkdirs();
			path.createNewFile();

			String html = GenericParser.parseClass(cl.getClazz(), links);
			html = GenericParser.resolveLinks(html, links, cl);
			html = HtmlGenerator.toHtml(cl.getClazz().getSimpleName(), html, treeCode);

			PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
			pw.print(html);
			pw.close();
		}
	}

	public List<Class<?>> loadAndScanJar(File jarFile) throws ClassNotFoundException, ZipException, IOException {

		List<Class<?>> classes = new ArrayList<>();

		JarFile jar = new JarFile(jarFile);

		// Getting the files into the jar
		Enumeration<? extends JarEntry> enumeration = jar.entries();

		// Iterates into the files in the jar file
		while (enumeration.hasMoreElements()) {
			ZipEntry zipEntry = enumeration.nextElement();

			// Is this a class?
			if (zipEntry.getName().endsWith(".class")) {

				// Relative path of file into the jar.
				String className = zipEntry.getName();

				// Complete class name
				className = className.replace(".class", "").replace("/", ".");
				if (!className.equals(GeneratorSkip.class.getName())) {
					// Load class definition from JVM
					Class<?> clazz = this.getClass().getClassLoader().loadClass(className);
					if (!clazz.isAnnotationPresent(GeneratorSkip.class)) {
						classes.add(clazz);
					}
				}

			}
		}
		jar.close();

		return classes;
	}
}
