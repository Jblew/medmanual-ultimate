package pl.jblew.mm.badania.krwi.hormony;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.badania.ZasadaPobierania;
import pl.jblew.mm.badania.krwi.BadanieKrwi;
import pl.jblew.mm.badania.krwi.RodzajProbówki;
import pl.jblew.mm.badania.materiały.Materiał;
import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.typy.Stan;

public abstract class BadanieHormonu extends BadanieKrwi {
	public static final BadanieHormonu BadanieHormonu = new BadanieHormonu() {

		@Override
		public Stan[] stany() {
			throw new NotImplementedYetException();
		}

	};

	protected BadanieHormonu() {
		_constructor();
	}

	@Override
	public RodzajProbówki[] rodzajeProbówki() {
		throw new NotImplementedYetException(); // TODO
	}

	@Override
	public ZasadaPobierania[] zasadyPobierania() {
		throw new NotImplementedYetException(); // TODO
	}

	@Override
	public Materiał[] materiały() {
		throw new NotImplementedYetException(); // TODO
	}

}
