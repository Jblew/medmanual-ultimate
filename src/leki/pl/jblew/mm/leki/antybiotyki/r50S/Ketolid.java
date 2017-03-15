package pl.jblew.mm.leki.antybiotyki.r50S;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class Ketolid extends Antybiotyk50S {
	public static final Ketolid Ketolid = new Ketolid();

	protected Ketolid() {
		_constructor();
	}

	public static class Telitromycyna extends Ketolid {
		public static final Telitromycyna Telitromycyna = new Telitromycyna();

		protected Telitromycyna() {
			_constructor();
		}
	}
}
