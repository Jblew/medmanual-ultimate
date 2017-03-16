package pl.jblew.mm.badania.artefakty;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class ZimneAglutyniny extends Artefakt {
	public static final ZimneAglutyniny ZimneAglutyniny = new ZimneAglutyniny();

	protected ZimneAglutyniny() {
		_constructor();
	}

	public String definicja() {
		return "Są to przeciwciała powodujące aglutynację erytrocytów w temperaturze pokojowej.\n"
				+ "Powodują powstawanie artefaktów w badaniach:\n" + "1. Obniżenie RBC\n" + "2. Zwiększenie MCV\n"
				+ "3. Zwiększenie MCHC";
	}
}
