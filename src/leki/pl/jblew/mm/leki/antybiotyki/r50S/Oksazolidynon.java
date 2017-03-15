package pl.jblew.mm.leki.antybiotyki.r50S;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class Oksazolidynon extends Antybiotyk50S {
	public static final Oksazolidynon Oksazolidynon = new Oksazolidynon();

	protected Oksazolidynon() {
		_constructor();
	}

	public static class Linezolid extends Oksazolidynon {
		public static final Linezolid Linezolid = new Linezolid();

		protected Linezolid() {
			_constructor();
		}
	}
}
