package pl.jblew.mm.leki.antybiotyki.chinolony;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class Chinolon4Generacji extends Chinolon {
	public static final Chinolon4Generacji Chinolon4Generacji = new Chinolon4Generacji();

	protected Chinolon4Generacji() {
		_constructor();
	}

	public static class Trowafloksacyna extends Chinolon4Generacji {
		public static final Trowafloksacyna Trowafloksacyna = new Trowafloksacyna();

		protected Trowafloksacyna() {
			_constructor();
		}
	}

	public static class Moksyfloksacyna extends Chinolon4Generacji {
		public static final Moksyfloksacyna Moksyfloksacyna = new Moksyfloksacyna();

		protected Moksyfloksacyna() {
			_constructor();
		}
	}
}
