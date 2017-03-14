package pl.jblew.mm.leki;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.typy.Stan;

public class Lek extends Stan {
	public static final Lek Lek = new Lek();

	protected Lek() {
		_constructor();
	}

	@Override
	public String definicja() {
		throw new NotImplementedYetException();
	}
}