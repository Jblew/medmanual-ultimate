package pl.jblew.mm.wirusy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.typy.Patogen;

public class Wirus extends Patogen {
	public static final Wirus Wirus = new Wirus();

	protected Wirus() {
		_constructor();
	}

	@Override
	public String definicja() {
		throw new NotImplementedYetException();
	}

}
