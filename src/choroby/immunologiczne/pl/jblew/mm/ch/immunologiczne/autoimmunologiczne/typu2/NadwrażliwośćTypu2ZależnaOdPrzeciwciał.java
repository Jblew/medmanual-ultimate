package pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.Nadwrażliwość;

public class NadwrażliwośćTypu2ZależnaOdPrzeciwciał extends Nadwrażliwość {
	public static final NadwrażliwośćTypu2ZależnaOdPrzeciwciał NadwrażliwośćTypu2ZależnaOdPrzeciwciał = new NadwrażliwośćTypu2ZależnaOdPrzeciwciał();

	protected NadwrażliwośćTypu2ZależnaOdPrzeciwciał() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Nadwrażliwość typu 2 jest spowodowana bezpośrednim działaniem przeciwciał"
				+ " na komórki docelowe lub inne składowe tkanek.";
	}
}
