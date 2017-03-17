package pl.jblew.mm.badania.krwi;

import pl.jblew.mm.badania.Badanie;
import pl.jblew.mm.badania.ZasadaPobierania;
import pl.jblew.mm.badania.materiały.Materiał;
import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.typy.Stan;

public abstract class BadanieKrwi extends Badanie {
	public static final BadanieKrwi BadanieKrwi = new BadanieKrwi() {

		@Override
		public RodzajProbówki[] rodzajeProbówki() {
			throw new NotImplementedYetException();
		}

		@Override
		public ZasadaPobierania[] zasadyPobierania() {
			throw new NotImplementedYetException();
		}

		@Override
		public Materiał[] materiały() {
			throw new NotImplementedYetException();
		}

		@Override
		public Stan[] stany() {
			throw new NotImplementedYetException();
		}
	};

	public abstract RodzajProbówki[] rodzajeProbówki();

}
