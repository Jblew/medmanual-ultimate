package pl.jblew.mm.generator;

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

	public Class<?> getClazz() {
		return clazz;
	}
}
