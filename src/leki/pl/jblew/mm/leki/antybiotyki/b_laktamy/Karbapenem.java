package pl.jblew.mm.leki.antybiotyki.b_laktamy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class Karbapenem extends BetaLaktam {
	public static final Karbapenem Karbapenem = new Karbapenem();

	protected Karbapenem() {
		_constructor();
	}

	public static class Imipenem extends Karbapenem {
		public static final Imipenem Imipenem = new Imipenem();

		protected Imipenem() {
			_constructor();
		}
	}

	public static class Meropenem extends Karbapenem {
		public static final Meropenem Meropenem = new Meropenem();

		protected Meropenem() {
			_constructor();
		}
	}

}
