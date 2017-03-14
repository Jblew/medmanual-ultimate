package pl.jblew.mm.leki.antybiotyki.b_laktamy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class Monobaktam extends BetaLaktam {
	public static final Monobaktam Monobaktam = new Monobaktam();

	protected Monobaktam() {
		_constructor();
	}

	public static class Aztreonam extends Monobaktam {
		public static final Aztreonam Aztreonam = new Aztreonam();

		protected Aztreonam() {
			_constructor();
		}
	}
}
