package pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu1;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.Nadwrażliwość;

public class NadwrażliwośćTypu1Natychmiastowa extends Nadwrażliwość {
	public static final NadwrażliwośćTypu1Natychmiastowa NadwrażliwośćTypu1 = new NadwrażliwośćTypu1Natychmiastowa();

	protected NadwrażliwośćTypu1Natychmiastowa() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Nadwrażliwość natychmiastowa to gwałtowna odpowiedź tkanek "
				+ "po interakcji antygenu z IgE związanym z błoną mastocytów i bazofilów. "
				+ "Następuje zwykle w ciągu kilku minut.";
	}
}
