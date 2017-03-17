package pl.jblew.mm.robaki;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.typy.Patogen;

public class Robak extends Patogen {
	public static final Robak Robak = new Robak();

	protected Robak() {
		_constructor();
	}

	@Override
	public String definicja() {
		throw new NotImplementedYetException();
	}

}
