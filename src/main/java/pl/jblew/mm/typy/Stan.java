package pl.jblew.mm.typy;

import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.dist.OddzielnaImplementacjaDlaKażdegoDziecka;
import pl.jblew.mm.generator.GeneratorSkip;
import pl.jblew.mm.generator.GenericParser;
import pl.jblew.mm.generator.SelfParsing;
import pl.jblew.mm.generator.ŚcieżkaStanów;

@GeneratorSkip
public abstract class Stan implements SelfParsing {
	public abstract String definicja();

	public Stan[] przyczyny() {
		throw new NotImplementedYetException();
	}

	public Stan[] skutki() {
		throw new NotImplementedYetException();
	}

	@Override
	@GeneratorSkip
	public String parse() {
		String out = "";
		try {
			out += "<h2>Definicja</h2><p>" + this.definicja() + "</p>";
		} catch (NotImplementedYetException | OddzielnaImplementacjaDlaKażdegoDziecka e) {

		}

		try {
			Stan[] przyczyny = przyczyny();
			out += "<h2>Przyczyny</h2>";
			out += "<ul>";
			for (Stan s : przyczyny) {
				out += "<li>" + s.toInlineString() + "</li>";
			}
			out += "</ul>";
		} catch (NotImplementedYetException | OddzielnaImplementacjaDlaKażdegoDziecka e) {

		}

		try {
			Stan[] skutki = skutki();
			out += "<h2>Skutki</h2>";
			out += "<ul>";
			for (Stan s : skutki) {
				out += "<li>" + s.toInlineString() + "</li>";
			}
			out += "</ul>";
		} catch (NotImplementedYetException | OddzielnaImplementacjaDlaKażdegoDziecka e) {

		}

		out += new ŚcieżkaStanów(this, ŚcieżkaStanów.Kierunek.OBA).toHtml();

		out += "<hr />";
		out += GenericParser.parseMethodsExcept(getClass(), this,
				new String[] { "definicja", "skutki", "przyczyny", "parse", "toInlineString", "toString" });
		return out;
	}

	@GeneratorSkip
	public String toInlineString() {
		return GenericParser.getLink(this.getClass());
	}

	@Override
	@GeneratorSkip
	public String toString() {
		return this.getClass().getName();
	}

	/*
	 * ## Static helper methods below
	 */
	@GeneratorSkip
	public static final Stan kombinacja(Stan... stany) {
		return new KombinacjaStanów(stany);
	}

	@GeneratorSkip
	public static final Stan stan(String stan) {
		return new StanTekstowy(stan);
	}

	@GeneratorSkip
	public static final Stan stan(Stan stan, String opis) {
		return kombinacja(stan, new StanTekstowy(opis));
	}

	@GeneratorSkip
	public ImageReference[] galeria() {
		return new ImageReference[] {};
	}

	@GeneratorSkip
	public static ImageReference _Image(String url, String podpis) {
		return new ImageReference(url, podpis);
	}

	@GeneratorSkip
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
