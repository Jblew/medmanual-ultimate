package pl.jblew.mm.badania.krwii.enzymatyczne;

public class AktywnośćFosfatazyAlkalicznej extends BadanieAktywnościEnzymu {
	private static AktywnośćFosfatazyAlkalicznej instance;

	private AktywnośćFosfatazyAlkalicznej() {
	}

	public static AktywnośćFosfatazyAlkalicznej I() {
		if (instance == null) {
			instance = new AktywnośćFosfatazyAlkalicznej();
		}
		return instance;
	}

	@Override
	public RodzajEnzymu jakiRodzajEnzymu() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
