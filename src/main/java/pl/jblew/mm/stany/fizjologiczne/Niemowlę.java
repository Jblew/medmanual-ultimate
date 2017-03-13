package pl.jblew.mm.stany.fizjologiczne;

import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.typy.Stan;

public class Niemowlę extends Stan {
	public static final Niemowlę Niemowlę = new Niemowlę();

	protected Niemowlę() {
	}

	@Override
	public String definicja() {
		throw new NotImplementedYetException();
	}
}
