package pl.jblew.mm.badania.krwii.enzymatyczne;

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
	
	
}
