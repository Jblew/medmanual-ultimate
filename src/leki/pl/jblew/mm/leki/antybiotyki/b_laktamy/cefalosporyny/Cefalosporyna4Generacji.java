package pl.jblew.mm.leki.antybiotyki.b_laktamy.cefalosporyny;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class Cefalosporyna4Generacji extends Cefalosporyna {
	public static final Cefalosporyna4Generacji Cefalosporyna4Generacji = new Cefalosporyna4Generacji();

	protected Cefalosporyna4Generacji() {
		_constructor();
	}

	public static class Cefepim extends Cefalosporyna4Generacji {
		public static final Cefepim Cefepim = new Cefepim();

		protected Cefepim() {
			_constructor();
		}
	}

	public static class Cefpirom extends Cefalosporyna4Generacji {
		public static final Cefpirom Cefpirom = new Cefpirom();

		protected Cefpirom() {
			_constructor();
		}
	}

	public static class Cefklidyna extends Cefalosporyna4Generacji {
		public static final Cefklidyna Cefklidyna = new Cefklidyna();

		protected Cefklidyna() {
			_constructor();
		}
	}
}
