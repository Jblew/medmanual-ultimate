package pl.jblew.mm.ch.immunologiczne.niedobory.pierwotne.odpowiedzinabytej;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.ch.immunologiczne.niedobory.pierwotne.PierwotnyNiedobórOdporności;

public class PospolityZmiennyNiedobórOdporności extends PierwotnyNiedobórOdporności {
	public static final PospolityZmiennyNiedobórOdporności PospolityZmiennyNiedobórOdporności = new PospolityZmiennyNiedobórOdporności();

	protected PospolityZmiennyNiedobórOdporności() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Heterogenna grupa chorób charakteryzujących się hipogammaglobulinemią, zaburzoną odpowiedzią "
				+ "humoralną na zakażenia (lub szczepienia) i wzrostem liczby zakażeń.";
	}
}
