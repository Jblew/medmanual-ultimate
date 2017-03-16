package pl.jblew.mm.ch.immunologiczne.niedobory.pierwotne.odpowiedzinabytej;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.ch.immunologiczne.niedobory.pierwotne.PierwotnyNiedobórOdporności;

public class IzolowanyNiedobórIgA extends PierwotnyNiedobórOdporności {
	public static final IzolowanyNiedobórIgA IzolowanyNiedobórIgA = new IzolowanyNiedobórIgA();

	protected IzolowanyNiedobórIgA() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Spośród immunoglobulin brakuje jedynie IgA.";
	}

	@Override
	public String epidemiologia() {
		return "Najczęstszy pierwotny niedobór odporności: 1/700 białych osób";
	}

	public String mechanizm() {
		return "Prawdopodobnie przyczyną jest zablokowanie końcowego różnicowania komótrk B wydzielających Iga "
				+ "w komórki plazmatyczne. Podstawy molekularne są nieznane.";
	}
}
