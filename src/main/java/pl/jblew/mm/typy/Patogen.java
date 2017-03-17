package pl.jblew.mm.typy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.dist.OddzielnaImplementacjaDlaKażdegoDziecka;

public class Patogen extends Stan {
	public static final Patogen Patogen = new Patogen();

	protected Patogen() {
		_constructor();
	}

	@Override
	public String definicja() {
		throw new OddzielnaImplementacjaDlaKażdegoDziecka();
	}
}
