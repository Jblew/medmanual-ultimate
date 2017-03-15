package pl.jblew.mm.leki.antybiotyki.chinolony;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class Chinolon2Generacji extends Chinolon {
	public static final Chinolon2Generacji Chinolon2Generacji = new Chinolon2Generacji();

	protected Chinolon2Generacji() {
		_constructor();
	}

	public static class Ofloksacyna extends Chinolon2Generacji {
		public static final Ofloksacyna Ofloksacyna = new Ofloksacyna();

		protected Ofloksacyna() {
			_constructor();
		}
	}

	public static class Ciprofloksacyna extends Chinolon2Generacji {
		public static final Ciprofloksacyna Ciprofloksacyna = new Ciprofloksacyna();

		protected Ciprofloksacyna() {
			_constructor();
		}
	}

	public static class Norfloksacyna extends Chinolon2Generacji {
		public static final Norfloksacyna Norfloksacyna = new Norfloksacyna();

		protected Norfloksacyna() {
			_constructor();
		}
	}

	public static class Lewofloksacyna extends Chinolon2Generacji {
		public static final Lewofloksacyna Lewofloksacyna = new Lewofloksacyna();

		protected Lewofloksacyna() {
			_constructor();
		}
	}
}
