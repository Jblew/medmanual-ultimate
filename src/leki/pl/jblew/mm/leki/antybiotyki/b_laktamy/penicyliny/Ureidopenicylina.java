package pl.jblew.mm.leki.antybiotyki.b_laktamy.penicyliny;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class Ureidopenicylina extends Penicylina {
	public static final Ureidopenicylina Ureidopenicylina = new Ureidopenicylina();

	protected Ureidopenicylina() {
		_constructor();
	}

	public static class Mezlocylina extends Ureidopenicylina {
		public static final Mezlocylina Mezlocylina = new Mezlocylina();

		protected Mezlocylina() {
			_constructor();
		}
	}

	public static class Azlocylina extends Ureidopenicylina {
		public static final Azlocylina Azlocylina = new Azlocylina();

		protected Azlocylina() {
			_constructor();
		}
	}

	public static class Piperacylina extends Ureidopenicylina {
		public static final Piperacylina Piperacylina = new Piperacylina();

		protected Piperacylina() {
			_constructor();
		}
	}
}
