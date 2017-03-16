package pl.jblew.mm.wirusy.papillomawirusy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.wirusy.Wirus;

public class Papillomawirus extends Wirus {
	public static final Papillomawirus Papillomawirus = new Papillomawirus();

	protected Papillomawirus() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "dsDNA, nagi kapsyd";
	}
}
