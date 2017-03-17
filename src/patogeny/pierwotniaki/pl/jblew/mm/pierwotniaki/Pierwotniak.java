package pl.jblew.mm.pierwotniaki;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.typy.Patogen;

public class Pierwotniak extends Patogen {
	public static final Pierwotniak Pierwotniak = new Pierwotniak();

	protected Pierwotniak() {
		_constructor();
	}

	@Override
	public String definicja() {
		throw new NotImplementedYetException();
	}

}
