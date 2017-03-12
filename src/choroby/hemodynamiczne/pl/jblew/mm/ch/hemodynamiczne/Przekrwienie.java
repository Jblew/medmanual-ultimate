package pl.jblew.mm.ch.hemodynamiczne;

import static pl.jblew.mm.dist.StaticUtils.link;

import pl.jblew.mm.ch.ogólnie.Choroba;

public class Przekrwienie extends Choroba {
	public static final Przekrwienie Przekrwienie = new Przekrwienie();

	protected Przekrwienie() {
	}

	@Override
	public String definicja() {
		return "Przekrwienie i " + link(Zastój.Zastój)
				+ "oznaczają miejscowe zwiększenie objętości krwi w danej tkance."
				+ "Różnią się mechanizmem powstania. Przekrwienie jest procecem czynnym wywołanym"
				+ " poszerzeniem tętniczek i zwiększonym przepływem krwii.";
	}

}
