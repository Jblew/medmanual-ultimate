package pl.jblew.mm.ch.ogólnie;

import pl.jblew.mm.dist.BłądMerytoryczny;
import pl.jblew.mm.typy.Stan;

public class Choroba extends Stan {
	public static final Choroba Choroba = new Choroba();

	protected Choroba() {
	}

	public Choroba nowotworowa() {
		if (this instanceof ChorobaNowotworowa) {
			return this;
		} else
			throw new BłądMerytoryczny("Ta choroba nie implementuje interfejsu ChorobaNowotworowa !");
	}
}
