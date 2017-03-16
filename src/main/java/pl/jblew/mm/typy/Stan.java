package pl.jblew.mm.typy;

import pl.jblew.mm.dist.NotImplementedYetException;

public abstract class Stan {
	public abstract String definicja();

	public Stan[] przyczyny() {
		throw new NotImplementedYetException();
	}

	public Stan[] skutki() {
		throw new NotImplementedYetException();
	}

	public static final Stan kombinacja(Stan... stany) {
		return new KombinacjaStanów(stany);
	}

	public ImageReference[] galeria() {
		return new ImageReference[] {};
	}

	public ImageReference _Image(String url, String podpis) {
		return new ImageReference(url, podpis);
	}

	public static class ImageReference {
		private final String relativeUrl;
		private final String description;

		public ImageReference(String relativeUrl, String description) {
			super();
			this.relativeUrl = relativeUrl;
			this.description = description;
		}

		public String getRelativeUrl() {
			return relativeUrl;
		}

		public String getDescription() {
			return description;
		}

	}

}
