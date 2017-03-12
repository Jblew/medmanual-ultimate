package pl.jblew.mm.badania.krwii.enzymatyczne;

import pl.jblew.mm.badania.WartośćReferencyjna;
import pl.jblew.mm.typy.Przyczyna;

public class AktywnośćElastazy extends BadanieAktywnościEnzymu {
	private static AktywnośćElastazy instance;

	private AktywnośćElastazy() {
	}

	public static AktywnośćElastazy I() {
		if (instance == null) {
			instance = new AktywnośćElastazy();
		}
		return instance;
	}

	@Override
	public RodzajEnzymu jakiRodzajEnzymu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String lokalizacja() {
		return "Lokalizcja do uzupłenienia";
	}

	@Override
	public String budowaEnzymu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reakcja() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WartośćReferencyjna[] wartościReferencyjne() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Przyczyna[] przyczynyHiper() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Przyczyna[] przyczynyHypo() {
		// TODO Auto-generated method stub
		return null;
	}

}
