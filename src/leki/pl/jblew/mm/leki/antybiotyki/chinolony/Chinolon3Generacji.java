package pl.jblew.mm.leki.antybiotyki.chinolony;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class Chinolon3Generacji extends Chinolon {
	public static final Chinolon3Generacji Chinolon3Generacji = new Chinolon3Generacji();

	protected Chinolon3Generacji() {
		_constructor();
	}

	public static class Sparfloksacyna extends Chinolon3Generacji {
		public static final Sparfloksacyna Sparfloksacyna = new Sparfloksacyna();

		protected Sparfloksacyna() {
			_constructor();
		}
	}

	public static class Gosufloksacyna extends Chinolon3Generacji {
		public static final Gosufloksacyna Gosufloksacyna = new Gosufloksacyna();

		protected Gosufloksacyna() {
			_constructor();
		}
	}

	public static class Grepafloksacyna extends Chinolon3Generacji {
		public static final Grepafloksacyna Grepafloksacyna = new Grepafloksacyna();

		protected Grepafloksacyna() {
			_constructor();
		}
	}
}
