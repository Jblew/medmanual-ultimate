package pl.jblew.mm.priony;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.typy.Patogen;

public class Prion extends Patogen {
	public static final Prion Prion = new Prion();

	protected Prion() {
		_constructor();
	}

	@Override
	public String definicja() {
		throw new NotImplementedYetException();
	}

}
