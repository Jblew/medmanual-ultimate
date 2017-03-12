package pl.jblew.mm.ch.hemodynamiczne;

import pl.jblew.mm.ch.ogólnie.Choroba;

public class Krwotok extends Choroba {
	public static final Krwotok Krwotok = new Krwotok();

	protected Krwotok() {
	}

	@Override
	public String definicja() {
		return "Wynaczynienie krwi poza łozysko naczyniowe";
	}
}
