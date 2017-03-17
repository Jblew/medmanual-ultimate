package pl.jblew.mm.stawonogi;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.typy.Patogen;

public class Stawonóg extends Patogen {
	public static final Stawonóg Stawonóg = new Stawonóg();

	protected Stawonóg() {
		_constructor();
	}

	@Override
	public String definicja() {
		throw new NotImplementedYetException();
	}

}
