package pl.jblew.mm.leki.antybiotyki.polipeptydowe;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class Polimyksyna extends AntybiotykPolipeptydowy {
	public static final Polimyksyna Polimyksyna = new Polimyksyna();

	protected Polimyksyna() {
		_constructor();
	}

	public static class PolimyksynaB extends Polimyksyna {
		public static final PolimyksynaB PolimyksynaB = new PolimyksynaB();

		protected PolimyksynaB() {
			_constructor();
		}
	}

	public static class Kolistyna extends Polimyksyna {
		public static final Kolistyna Kolistyna = new Kolistyna();

		protected Kolistyna() {
			_constructor();
		}
	}
}
