package pl.jblew.mm.bakterie.gujemne.krętki;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class TrepanomaSpp extends Krętek {
	public static final TrepanomaSpp TrepanomaSpp = new TrepanomaSpp();

	protected TrepanomaSpp() {
		_constructor();
	}

	public static class TrepanomaPallidum extends TrepanomaSpp {
		public static final TrepanomaPallidum TrepanomaPallidum = new TrepanomaPallidum();

		protected TrepanomaPallidum() {
			_constructor();
		}
	}
}
