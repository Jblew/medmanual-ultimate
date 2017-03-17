package pl.jblew.mm.bakterie;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.typy.Patogen;

public class Bakteria extends Patogen {
	public static final Bakteria Bakteria = new Bakteria();

	protected Bakteria() {
		_constructor();
	}

	@Override
	public String definicja() {
		throw new NotImplementedYetException();
	}

}
