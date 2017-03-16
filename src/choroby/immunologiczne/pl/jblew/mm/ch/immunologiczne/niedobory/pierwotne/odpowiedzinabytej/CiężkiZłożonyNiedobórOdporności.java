package pl.jblew.mm.ch.immunologiczne.niedobory.pierwotne.odpowiedzinabytej;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.ch.immunologiczne.niedobory.pierwotne.PierwotnyNiedobórOdporności;

public class CiężkiZłożonyNiedobórOdporności extends PierwotnyNiedobórOdporności {
	public static final CiężkiZłożonyNiedobórOdporności CiężkiZłożonyNiedobórOdporności = new CiężkiZłożonyNiedobórOdporności();

	protected CiężkiZłożonyNiedobórOdporności() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Zbiór genetycznie różnych zespołów z podobnymi zaburzeniami. Każdy z tych zespołów charakteryzują "
				+ "zaburzenia obu rodzajów odporności: humoralnej i komórkowej.";
	}
}
