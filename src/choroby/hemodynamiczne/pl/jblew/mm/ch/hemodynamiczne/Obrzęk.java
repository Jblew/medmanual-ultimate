package pl.jblew.mm.ch.hemodynamiczne;

import pl.jblew.mm.ch.ogólnie.Choroba;

public class Obrzęk extends Choroba {
	public static final Obrzęk Obrzęk = new Obrzęk();

	protected Obrzęk() {
	}

	@Override
	public String definicja() {
		return "Gromadzenie płynu śródmiąższowego w tkankach";
	}
}
