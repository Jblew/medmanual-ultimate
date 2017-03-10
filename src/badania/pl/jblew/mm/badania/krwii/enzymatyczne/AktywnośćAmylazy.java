package pl.jblew.mm.badania.krwii.enzymatyczne;

public class AktywnośćAmylazy extends BadanieAktywnościEnzymu {
	private static AktywnośćAmylazy instance;

	private AktywnośćAmylazy() {
	}

	public static AktywnośćAmylazy I() {
		if (instance == null) {
			instance = new AktywnośćAmylazy();
		}
		return instance;
	}

	@Override
	public RodzajEnzymu jakiRodzajEnzymu() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
