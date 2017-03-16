package pl.jblew.mm.ch.immunologiczne.autoimmunologiczne;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.ch.ogólnie.Choroba;

public class ChorobaZwiązanaZIgG4 extends Choroba {
	public static final ChorobaZwiązanaZIgG4 ChorobaZwiązanaZIgG4 = new ChorobaZwiązanaZIgG4();

	protected ChorobaZwiązanaZIgG4() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Jest to choroba przebiegająca z zapaleniem i włóknieniem, które charakteryzuje się "
				+ "wystąpieniem guzowatych zmian w różnych narządach. W tkankach występuje zwiększona liczba "
				+ "plazmocytów produkujących IgG4. Często, ale nie zawsze także poziom IgG4 w surowicy jest podniesiony.";
	}
}
