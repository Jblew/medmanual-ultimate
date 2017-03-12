package pl.jblew.mm.ch.hemodynamiczne;

import static pl.jblew.mm.dist.StaticUtils.link;

import pl.jblew.mm.ch.ogólnie.Choroba;

public class Zastój extends Choroba {
	public static final Zastój Zastój = new Zastój();

	protected Zastój() {
	}

	@Override
	public String definicja() {
		return "Zastój i " + link(Przekrwienie.Przekrwienie)
				+ "oznaczają miejscowe zwiększenie objętości krwi w danej tkance."
				+ "Różnią się mechanizmem powstania. Zastój to proces bierny wywołany upośledzonym odpływem żylnym.";
	}
}
