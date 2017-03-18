package pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.Nadwrażliwość;

public final class NadwrażliwośćTypu2ZależnaOdPrzeciwciał extends Nadwrażliwość {
	public static final NadwrażliwośćTypu2ZależnaOdPrzeciwciał NadwrażliwośćTypu2ZależnaOdPrzeciwciał = new NadwrażliwośćTypu2ZależnaOdPrzeciwciał(
			"-", "-");

	public NadwrażliwośćTypu2ZależnaOdPrzeciwciał(String antygen, String mechanizmNiszczenia) {
		super(antygen, mechanizmNiszczenia);
	}

	@Override
	public String definicja() {
		return "Nadwrażliwość typu 2 jest spowodowana bezpośrednim działaniem przeciwciał"
				+ " na komórki docelowe lub inne składowe tkanek.";
	}
}
