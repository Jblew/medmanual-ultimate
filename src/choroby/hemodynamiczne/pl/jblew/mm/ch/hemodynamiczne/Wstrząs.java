package pl.jblew.mm.ch.hemodynamiczne;

import pl.jblew.mm.ch.ogólnie.Choroba;

public class Wstrząs extends Choroba {
	public static final Wstrząs Wstrząs = new Wstrząs();

	protected Wstrząs() {
	}

	@Override
	public String definicja() {
		return "Wstrząs to stan uogólnionego krytycznego upośledzenia perfuzji tkanek "
				+ "spowodowany zmniejszeniem rzutu serca lub objętości krwi krążącej (w stosunku do "
				+ "objętości łożyska naczyniowego).";
	}

}