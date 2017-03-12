package pl.jblew.mm.ch.hemodynamiczne;

import pl.jblew.mm.ch.ogólnie.Choroba;

public class Wstrząs extends Choroba {
	public static final Wstrząs Wstrząs = new Wstrząs();

	protected Wstrząs() {
	}

	@Override
	public String definicja() {
		return "Gromadzenie płynu śródmiąższowego w tkankach";
	}

}