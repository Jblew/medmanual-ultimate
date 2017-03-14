package pl.jblew.mm.leki.antybiotyki.b_laktamy.cefalosporyny;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class Cefalosporyna1Generacji extends Cefalosporyna {
	public static final Cefalosporyna1Generacji Cefalosporyna1Generacji = new Cefalosporyna1Generacji();

	protected Cefalosporyna1Generacji() {
		_constructor();
	}

	public static class Cefapiryna extends Cefalosporyna1Generacji {
		public static final Cefapiryna Cefapiryna = new Cefapiryna();

		protected Cefapiryna() {
			_constructor();
		}
	}

	public static class Cefaleksyna extends Cefalosporyna1Generacji {
		public static final Cefaleksyna Cefaleksyna = new Cefaleksyna();

		protected Cefaleksyna() {
			_constructor();
		}
	}

	public static class Cefalotyna extends Cefalosporyna1Generacji {
		public static final Cefalotyna Cefalotyna = new Cefalotyna();

		protected Cefalotyna() {
			_constructor();
		}
	}

	public static class Cefradyna extends Cefalosporyna1Generacji {
		public static final Cefradyna Cefradyna = new Cefradyna();

		protected Cefradyna() {
			_constructor();
		}
	}

	public static class Cefazolina extends Cefalosporyna1Generacji {
		public static final Cefazolina Cefazolina = new Cefazolina();

		protected Cefazolina() {
			_constructor();
		}
	}

	public static class Cefadroksyl extends Cefalosporyna1Generacji.Cefazolina {
		public static final Cefadroksyl Cefadroksyl = new Cefadroksyl();

		protected Cefadroksyl() {
			_constructor();
		}
	}
}
