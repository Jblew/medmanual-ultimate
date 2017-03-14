package pl.jblew.mm.leki.antybiotyki.b_laktamy.penicyliny;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class Aminopenicylina extends Penicylina {
	public static final Aminopenicylina Aminopenicylina = new Aminopenicylina();

	protected Aminopenicylina() {
		_constructor();
	}

	public static class Ampicylina extends Aminopenicylina {
		public static final Ampicylina Ampicylina = new Ampicylina();

		protected Ampicylina() {
			_constructor();
		}
	}

	public static class Amoksycylina extends Aminopenicylina {
		public static final Amoksycylina Amoksycylina = new Amoksycylina();

		protected Amoksycylina() {
			_constructor();
		}
	}
}
