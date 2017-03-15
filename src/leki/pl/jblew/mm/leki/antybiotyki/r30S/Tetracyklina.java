package pl.jblew.mm.leki.antybiotyki.r30S;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class Tetracyklina extends Antybiotyk30S {
	public static final Tetracyklina Tetracyklina = new Tetracyklina();

	protected Tetracyklina() {
		_constructor();
	}

	public static class Tetracyklina_ extends Tetracyklina {
		public static final Tetracyklina_ Tetracyklina_ = new Tetracyklina_();

		protected Tetracyklina_() {
			_constructor();
		}
	}

	public static class Doksycyklina extends Tetracyklina {
		public static final Doksycyklina Doksycyklina = new Doksycyklina();

		protected Doksycyklina() {
			_constructor();
		}
	}

	public static class Minocyklina extends Tetracyklina {
		public static final Minocyklina Minocyklina = new Minocyklina();

		protected Minocyklina() {
			_constructor();
		}
	}

	public static class Tygecyklina extends Tetracyklina {
		public static final Tygecyklina Tygecyklina = new Tygecyklina();

		protected Tygecyklina() {
			_constructor();
		}
	}
}
