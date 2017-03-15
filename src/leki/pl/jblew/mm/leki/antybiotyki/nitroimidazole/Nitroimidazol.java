package pl.jblew.mm.leki.antybiotyki.nitroimidazole;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.leki.antybiotyki.Antybiotyk;

public class Nitroimidazol extends Antybiotyk {
	public static final Nitroimidazol Nitroimidazol = new Nitroimidazol();

	protected Nitroimidazol() {
		_constructor();
	}

	public static class Metronidazol extends Nitroimidazol {
		public static final Metronidazol Metronidazol = new Metronidazol();

		protected Metronidazol() {
			_constructor();
		}
	}

	public static class Tynidazol extends Nitroimidazol {
		public static final Tynidazol Tynidazol = new Tynidazol();

		protected Tynidazol() {
			_constructor();
		}
	}

	public static class Ornidazol extends Nitroimidazol {
		public static final Ornidazol Ornidazol = new Ornidazol();

		protected Ornidazol() {
			_constructor();
		}
	}
}
