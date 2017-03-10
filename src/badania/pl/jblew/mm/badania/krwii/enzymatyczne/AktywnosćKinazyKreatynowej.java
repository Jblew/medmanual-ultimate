package pl.jblew.mm.badania.krwii.enzymatyczne;

public class AktywnosćKinazyKreatynowej extends BadanieAktywnościEnzymu {
	private static AktywnosćKinazyKreatynowej instance;

	private AktywnosćKinazyKreatynowej() {
	}

	public static AktywnosćKinazyKreatynowej I() {
		if (instance == null) {
			instance = new AktywnosćKinazyKreatynowej();
		}
		return instance;
	}
	
	@Override
	public RodzajEnzymu jakiRodzajEnzymu() {
		// TODO Auto-generated method stub
		return null;
	}

}
