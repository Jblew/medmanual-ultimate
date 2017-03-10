package pl.jblew.mm.badania.krwii.enzymatyczne;

public class AktywnośćCholinesterazy  extends BadanieAktywnościEnzymu {
	private static AktywnośćCholinesterazy instance;

	private AktywnośćCholinesterazy() {
	}

	public static AktywnośćCholinesterazy I() {
		if (instance == null) {
			instance = new AktywnośćCholinesterazy();
		}
		return instance;
	}

	@Override
	public RodzajEnzymu jakiRodzajEnzymu() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
