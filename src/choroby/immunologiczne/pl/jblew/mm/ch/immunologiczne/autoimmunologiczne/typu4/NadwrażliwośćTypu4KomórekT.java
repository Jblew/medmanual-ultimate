package pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu4;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.Nadwrażliwość;

public final class NadwrażliwośćTypu4KomórekT extends Nadwrażliwość {
	public static final NadwrażliwośćTypu4KomórekT NadwrażliwośćTypu4KomórekT = new NadwrażliwośćTypu4KomórekT("-",
			"-");

	public NadwrażliwośćTypu4KomórekT(String antygen, String mechanizmNiszczenia) {
		super(antygen, mechanizmNiszczenia);
	}

	@Override
	public String definicja() {
		return "";
	}

}
