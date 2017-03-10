package pl.jblew.mm.badania.krwii.enzymatyczne;

public class AktywnośćFosfatazyKwaśnej extends BadanieAktywnościEnzymu {
	private static AktywnośćFosfatazyKwaśnej instance;

	private AktywnośćFosfatazyKwaśnej() {
	}

	public static AktywnośćFosfatazyKwaśnej I() {
		if (instance == null) {
			instance = new AktywnośćFosfatazyKwaśnej();
		}
		return instance;
	}
	
	@Override
	public RodzajEnzymu jakiRodzajEnzymu() {
		// TODO Auto-generated method stub
		return null;
	}

}
