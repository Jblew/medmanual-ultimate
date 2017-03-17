package pl.jblew.mm.badania.materiały;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public abstract class Krew extends Materiał {
	public static final Krew Krew = new Krew() {

	};

	protected Krew() {
		_constructor();
	}
}
