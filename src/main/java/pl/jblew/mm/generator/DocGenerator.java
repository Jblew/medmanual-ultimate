package pl.jblew.mm.generator;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class DocGenerator {
	private final File rootDir;
	private final File rootClassDir;
	private final Class<?> rootClass;

	public DocGenerator(String path, File rootClassDir, Class<?> rootClass) {
		this.rootDir = new File(path);
		this.rootClassDir = rootClassDir;
		this.rootClass = rootClass;
	}

	public void generate() throws IOException {
		if (rootDir.exists()) {
			FileUtils.deleteDirectory(rootDir);
		}
		if (!rootDir.mkdirs())
			throw new IOException("Could not create dirs");

		PackageGenerator pkgGen = new PackageGenerator(rootDir, rootClassDir, rootClass.getPackage());
		pkgGen.generate();
	}

}
