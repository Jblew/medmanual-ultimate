package pl.jblew.mm.leki.antybiotyki.r50S;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class Linkozamid extends Antybiotyk50S {
	public static final Linkozamid Linkozamid = new Linkozamid();

	protected Linkozamid() {
		_constructor();
	}

	public static class Linkomycyna extends Linkozamid {
		public static final Linkomycyna Linkomycyna = new Linkomycyna();

		protected Linkomycyna() {
			_constructor();
		}
	}

	public static class Klindamycyna extends Linkozamid {
		public static final Klindamycyna Klindamycyna = new Klindamycyna();

		protected Klindamycyna() {
			_constructor();
		}
	}
}
