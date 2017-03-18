package pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu1;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.Nadwrażliwość;

public final class NadwrażliwośćTypu1Natychmiastowa extends Nadwrażliwość {
	public static final NadwrażliwośćTypu1Natychmiastowa NadwrażliwośćTypu1Natychmiastowa = new NadwrażliwośćTypu1Natychmiastowa(
			"-", "-");

	public NadwrażliwośćTypu1Natychmiastowa(String antygen, String mechanizmNiszczenia) {
		super(antygen, mechanizmNiszczenia);
	}

	@Override
	public String definicja() {
		return "Nadwrażliwość natychmiastowa to gwałtowna odpowiedź tkanek "
				+ "po interakcji antygenu z IgE związanym z błoną mastocytów i bazofilów. "
				+ "Następuje zwykle w ciągu kilku minut.";
	}

}
