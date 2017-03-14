package pl.jblew.mm.leki.antybiotyki.b_laktamy.penicyliny;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class Karboksypenicylina extends Penicylina {
	public static final Karboksypenicylina Karboksypenicylina = new Karboksypenicylina();

	protected Karboksypenicylina() {
		_constructor();
	}

	public static class Kerbenicylina extends Karboksypenicylina {
		public static final Kerbenicylina Kerbenicylina = new Kerbenicylina();

		protected Kerbenicylina() {
			_constructor();
		}
	}

	public static class Tykeracylina extends Karboksypenicylina {
		public static final Tykeracylina Tykeracylina = new Tykeracylina();

		protected Tykeracylina() {
			_constructor();
		}
	}
}
