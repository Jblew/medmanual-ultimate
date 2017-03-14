package pl.jblew.mm.leki.antybiotyki.b_laktamy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class InhibitorBLaktamaz extends BetaLaktam {
	public static final InhibitorBLaktamaz InhibitorBLaktamaz = new InhibitorBLaktamaz();

	protected InhibitorBLaktamaz() {
		_constructor();
	}

	public static class KwasKlawulonowy extends InhibitorBLaktamaz {
		public static final KwasKlawulonowy KwasKlawulonowy = new KwasKlawulonowy();

		protected KwasKlawulonowy() {
			_constructor();
		}
	}

	public static class Sulbaktam extends InhibitorBLaktamaz {
		public static final Sulbaktam Sulbaktam = new Sulbaktam();

		protected Sulbaktam() {
			_constructor();
		}
	}

	public static class Tazobaktam extends InhibitorBLaktamaz {
		public static final Tazobaktam Tazobaktam = new Tazobaktam();

		protected Tazobaktam() {
			_constructor();
		}
	}
}
