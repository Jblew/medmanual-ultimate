package pl.jblew.mm.badania.krwi.hormony.podwzgórza;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.badania.krwi.hormony.BadanieHormonu;
import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.typy.Stan;

public class Oksytocyna extends BadanieHormonu {
	public static final Oksytocyna Oksytocyna = new Oksytocyna();

	protected Oksytocyna() {
		_constructor();
	}

	@Override
	public Stan[] stany() {
		return array(Hiper.Hiper, Hypo.Hypo);
	}

	public static class Hiper extends Stan {
		public static final Hiper Hiper = new Hiper();

		@Override
		public String definicja() {
			throw new NotImplementedYetException();
			// TODO Oksytocyna.Hiper.definicja
		}
	}

	public static class Hypo extends Stan {
		public static final Hypo Hypo = new Hypo();

		@Override
		public String definicja() {
			throw new NotImplementedYetException();
			// TODO Oksytocyna.Hypo.definicja
		}
	}
}
