package pl.jblew.mm.ch.immunologiczne.niedobory.pierwotne.odpowiedzinabytej;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.ch.immunologiczne.niedobory.pierwotne.PierwotnyNiedobórOdporności;

public class ZaburzeniaAktywacjiLimfocytów extends PierwotnyNiedobórOdporności {
	public static final ZaburzeniaAktywacjiLimfocytów ZaburzeniaAktywacjiLimfocytów = new ZaburzeniaAktywacjiLimfocytów();

	protected ZaburzeniaAktywacjiLimfocytów() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Mutacje genów potrzebnych do aktywacj limfocytów T.";
	}
}
