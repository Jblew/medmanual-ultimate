package pl.jblew.mm.leki.antybiotyki.r50S;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class Makrolid extends Antybiotyk50S {
	public static final Makrolid Makrolid = new Makrolid();

	protected Makrolid() {
		_constructor();
	}

	public static class Erytromycyna extends Makrolid {
		public static final Erytromycyna Erytromycyna = new Erytromycyna();

		protected Erytromycyna() {
			_constructor();
		}
	}

	public static class Klarytromycyna extends Makrolid {
		public static final Klarytromycyna Klarytromycyna = new Klarytromycyna();

		protected Klarytromycyna() {
			_constructor();
		}
	}

	public static class Roksytromycyna extends Makrolid {
		public static final Roksytromycyna Roksytromycyna = new Roksytromycyna();

		protected Roksytromycyna() {
			_constructor();
		}
	}

	public static class Spiramycyna extends Makrolid {
		public static final Spiramycyna Spiramycyna = new Spiramycyna();

		protected Spiramycyna() {
			_constructor();
		}
	}

	public static class Azitromycyna extends Makrolid {
		public static final Azitromycyna Azitromycyna = new Azitromycyna();

		protected Azitromycyna() {
			_constructor();
		}
	}
}
