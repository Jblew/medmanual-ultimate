package pl.jblew.mm.ch.immunologiczne.niedobory.pierwotne.odpowiedzinabytej;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.ch.immunologiczne.niedobory.pierwotne.PierwotnyNiedobórOdporności;

public class ZespółHiperIgM extends PierwotnyNiedobórOdporności {
	public static final ZespółHiperIgM ZespółHiperIgM = new ZespółHiperIgM();

	protected ZespółHiperIgM() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Brak zdolności (lub brak sygnałów) limfocytów B do zmiany klasy wytwarzanych przeciwciał z IgM na następne klasy.";
	}

	public String mechanizm() {
		return "Najczęściej: niezdolność limfocytów T do indukowania przełączania klas lub izotypów kom. B. "
				+ "Najczęstszą molekularną przyczyną jest mutacja genu CD40L.";
	}
}
