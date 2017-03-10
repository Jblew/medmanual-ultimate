package pl.jblew.mm.badania.krwii.enzymatyczne;

public class AktywnośćAminotransferazyAlaninowej  extends BadanieAktywnościEnzymu {
	private static AktywnośćAminotransferazyAlaninowej instance;

	private AktywnośćAminotransferazyAlaninowej() {
	}

	public static AktywnośćAminotransferazyAlaninowej I() {
		if (instance == null) {
			instance = new AktywnośćAminotransferazyAlaninowej();
		}
		return instance;
	}
	
	@Override
	public RodzajEnzymu jakiRodzajEnzymu() {
		// TODO Auto-generated method stub
		return null;
	}

}
