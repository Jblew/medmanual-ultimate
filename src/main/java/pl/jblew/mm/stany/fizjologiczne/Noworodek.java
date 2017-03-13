package pl.jblew.mm.stany.fizjologiczne;

import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.typy.Stan;

public class Noworodek extends Stan {
	public static final Noworodek Noworodek = new Noworodek();

	private Noworodek() {
	}

	@Override
	public String definicja() {
		throw new NotImplementedYetException();
	}
}
