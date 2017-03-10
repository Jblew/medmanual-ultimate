package pl.jblew.mm.badania.krwii.enzymatyczne;

public class AktywnośćGammaglutamylotransferazy extends BadanieAktywnościEnzymu {
	private static AktywnośćGammaglutamylotransferazy instance;

	private AktywnośćGammaglutamylotransferazy() {
	}

	public static AktywnośćGammaglutamylotransferazy I() {
		if (instance == null) {
			instance = new AktywnośćGammaglutamylotransferazy();
		}
		return instance;
	}

	@Override
	public RodzajEnzymu jakiRodzajEnzymu() {
		// TODO Auto-generated method stub
		return null;
	}
}
