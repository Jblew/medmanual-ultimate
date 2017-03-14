package pl.jblew.mm.leki.antybiotyki.b_laktamy.penicyliny;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class PenicylinaIzoksalinowa extends Penicylina {
	public static final PenicylinaIzoksalinowa PenicylinaIzoksalinowa = new PenicylinaIzoksalinowa();

	protected PenicylinaIzoksalinowa() {
		_constructor();
	}

	public static class Metycylina extends PenicylinaIzoksalinowa {
		public static final Metycylina Metycylina = new Metycylina();

		protected Metycylina() {
			_constructor();
		}
	}

	public static class Oksacylina extends PenicylinaIzoksalinowa {
		public static final Oksacylina Oksacylina = new Oksacylina();

		protected Oksacylina() {
			_constructor();
		}
	}

	public static class Kloksacylina extends PenicylinaIzoksalinowa {
		public static final Kloksacylina Kloksacylina = new Kloksacylina();

		protected Kloksacylina() {
			_constructor();
		}
	}

	public static class Dikloksacylina extends PenicylinaIzoksalinowa {
		public static final Dikloksacylina Dikloksacylina = new Dikloksacylina();

		protected Dikloksacylina() {
			_constructor();
		}
	}

	public static class Nafcylina extends PenicylinaIzoksalinowa {
		public static final Nafcylina Nafcylina = new Nafcylina();

		protected Nafcylina() {
			_constructor();
		}
	}
}
