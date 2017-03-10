package pl.jblew.mm.badania.krwii.enzymatyczne;

public class Aktywność5PNukleozydazy extends BadanieAktywnościEnzymu {
	private static Aktywność5PNukleozydazy instance;

	private Aktywność5PNukleozydazy() {
	}

	public static Aktywność5PNukleozydazy I() {
		if (instance == null) {
			instance = new Aktywność5PNukleozydazy();
		}
		return instance;
	}

	@Override
	public RodzajEnzymu jakiRodzajEnzymu() {
		// TODO Auto-generated method stub
		return null;
	}
}
