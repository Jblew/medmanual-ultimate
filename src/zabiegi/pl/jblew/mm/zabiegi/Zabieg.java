package pl.jblew.mm.zabiegi;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.typy.Stan;

public class Zabieg extends Stan {
	public static final Zabieg Zabieg = new Zabieg();

	protected Zabieg() {
		_constructor();
	}

	@Override
	public String definicja() {
		throw new NotImplementedYetException();
	}

}
