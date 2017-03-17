package pl.jblew.mm.bakterie.gujemne.krętki;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.adnotacje.Image;

public class BorreliaSpp extends Krętek {
	public static final BorreliaSpp BorreliaSpp = new BorreliaSpp();

	protected BorreliaSpp() {
		_constructor();
	}

	public static class BorreliaBurgdorferi extends BorreliaSpp {
		public static final BorreliaBurgdorferi BorreliaBurgdorferi = new BorreliaBurgdorferi();

		@Image(url = "Borrelia_burgdorferi_.jpg") /*
													
													
													
													
													
													
													
													
													
													
													
													
													
													*/
		public BorreliaBurgdorferi() {

		}
	}
}
