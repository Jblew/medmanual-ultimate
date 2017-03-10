package pl.jblew.mm.badania.krwii.enzymatyczne;

import pl.jblew.mm.adnotacje.Image;

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

	@Image(url="ldh.jpg") /*
	
	

	
	
	
	*/
	public String reakcja() {
		return "LDH katalizuje reakcję utleniania kwasu mlekowego i przekształcania do pirogronianu.";
	}
}
