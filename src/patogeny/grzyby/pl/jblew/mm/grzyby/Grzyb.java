package pl.jblew.mm.grzyby;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.typy.Patogen;

public class Grzyb extends Patogen {
	public static final Grzyb Grzyb = new Grzyb();

	protected Grzyb() {
		_constructor();
	}

	@Override
	public String definicja() {
		throw new NotImplementedYetException();
	}

}
