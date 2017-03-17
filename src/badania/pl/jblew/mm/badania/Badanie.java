package pl.jblew.mm.badania;

import pl.jblew.mm.badania.materiały.Materiał;
import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.generator.GeneratorSkip;
import pl.jblew.mm.typy.Stan;

public abstract class Badanie {
	@GeneratorSkip
	public static final Badanie Badanie = new Badanie() {

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

	public abstract ZasadaPobierania[] zasadyPobierania();

	public abstract Materiał[] materiały();

	// public abstract Przyczyna[] przyczynyHiper();

	// public abstract Przyczyna[] przyczynyHypo();

	public abstract Stan[] stany();

	@GeneratorSkip
	public final ZasadaPobierania zasada(String zasada) {
		return new TekstowaZasadaPobierania(zasada);
	}
}
