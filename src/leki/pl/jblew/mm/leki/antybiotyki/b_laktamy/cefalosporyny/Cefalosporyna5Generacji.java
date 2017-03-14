package pl.jblew.mm.leki.antybiotyki.b_laktamy.cefalosporyny;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class Cefalosporyna5Generacji extends Cefalosporyna {
	public static final Cefalosporyna5Generacji Cefalosporyna5Generacji = new Cefalosporyna5Generacji();

	protected Cefalosporyna5Generacji() {
		_constructor();
	}

	public static class Ceftabiprol extends Cefalosporyna5Generacji {
		public static final Ceftabiprol Ceftabiprol = new Ceftabiprol();

		protected Ceftabiprol() {
			_constructor();
		}
	}

	public static class Ceftarolina extends Cefalosporyna5Generacji {
		public static final Ceftarolina Ceftarolina = new Ceftarolina();

		protected Ceftarolina() {
			_constructor();
		}
	}
}
