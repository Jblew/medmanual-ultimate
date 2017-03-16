package pl.jblew.mm.badania.krwi.enzymatyczne;

import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.badania.WartośćReferencyjna;
import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.typy.Stan;

public class AktywnośćCholinesterazy extends BadanieAktywnościEnzymu {
	public static final AktywnośćCholinesterazy AktywnośćCholinesterazy = new AktywnośćCholinesterazy();

	protected AktywnośćCholinesterazy() {
	}

	@Override
	public RodzajEnzymu jakiRodzajEnzymu() {
		return null;
	}

	@Override
	public String lokalizacja() {
		throw new NotImplementedYetException();
	}

	@Override
	public String budowaEnzymu() {
		throw new NotImplementedYetException();
	}

	@Override
	public String reakcja() {
		throw new NotImplementedYetException();
	}

	@Override
	public WartośćReferencyjna[] wartościReferencyjne() {
		throw new NotImplementedYetException();
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
			// TODO AktywnośćCholinesterazy.Hiper.definicja
		}
	}

	public static class Hypo extends Stan {
		public static final Hypo Hypo = new Hypo();

		@Override
		public String definicja() {
			throw new NotImplementedYetException();
			// TODO AktywnośćCholinesterazy.Hypo.definicja
		}
	}

}
