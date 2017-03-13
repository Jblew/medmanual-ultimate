package pl.jblew.mm.badania.krwii.enzymatyczne;

import pl.jblew.mm.badania.WartośćReferencyjna;
import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.typy.Przyczyna;

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
	public Przyczyna[] przyczynyHiper() {
		throw new NotImplementedYetException();
	}

	@Override
	public Przyczyna[] przyczynyHypo() {
		throw new NotImplementedYetException();
	}

}
