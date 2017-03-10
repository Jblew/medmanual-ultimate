package pl.jblew.mm.badania.krwii.enzymatyczne;

public class AktywnośćAminotransferazyAsparaginianowej  extends BadanieAktywnościEnzymu {
	private static AktywnośćAminotransferazyAsparaginianowej instance;

	private AktywnośćAminotransferazyAsparaginianowej() {
	}

	public static AktywnośćAminotransferazyAsparaginianowej I() {
		if (instance == null) {
			instance = new AktywnośćAminotransferazyAsparaginianowej();
		}
		return instance;
	}
	
	@Override
	public RodzajEnzymu jakiRodzajEnzymu() {
		// TODO Auto-generated method stub
		return null;
	}

}
