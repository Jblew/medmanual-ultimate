package pl.jblew.mm.badania.krwii.enzymatyczne;

public final class AktywnośćDehydrogenazyMleczanowej extends BadanieAktywnościEnzymu {
	private static AktywnośćDehydrogenazyMleczanowej instance;

	private AktywnośćDehydrogenazyMleczanowej() {
	}

	public static AktywnośćDehydrogenazyMleczanowej I() {
		if (instance == null) {
			instance = new AktywnośćDehydrogenazyMleczanowej();
		}
		return instance;
	}
	
	@Override
	public RodzajEnzymu jakiRodzajEnzymu() {
		return null;
	}

}
