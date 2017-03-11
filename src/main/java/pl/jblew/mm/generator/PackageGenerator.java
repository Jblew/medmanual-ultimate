package pl.jblew.mm.generator;

import java.io.File;

public class PackageGenerator {
	private final Package pkg;
	private final File docParentDir;
	private final File sourcesPackageDir;

	public PackageGenerator(File docParentDir, File sourcesPackageDir, Package pkg) {
		this.docParentDir = docParentDir;
		this.sourcesPackageDir = sourcesPackageDir;
		this.pkg = pkg;
	}

	public void generate() {
		if (pkg.isAnnotationPresent(GeneratorSkip.class))
			return;

	}
}
