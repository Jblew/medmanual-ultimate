package pl.jblew.mm.badania.krwii.enzymatyczne;

public class AktywnośćLipazy extends BadanieAktywnościEnzymu {
	private static AktywnośćLipazy instance;

	private AktywnośćLipazy() {
	}

	public static AktywnośćLipazy I() {
		if (instance == null) {
			instance = new AktywnośćLipazy();
		}
		return instance;
	}

	@Override
	public RodzajEnzymu jakiRodzajEnzymu() {
		// TODO Auto-generated method stub
		return null;
	}
}
