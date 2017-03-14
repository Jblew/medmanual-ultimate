package pl.jblew.mm.ch.hemostatyczne.nadkrzepliwości;

import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class MutacjaGenuProtrombiny extends Choroba {
	public static final MutacjaGenuProtrombiny MutacjaGenuProtrombiny = new MutacjaGenuProtrombiny();

	protected MutacjaGenuProtrombiny() {
	}

	@Override
	public Stan[] skutki() {
		return array(Nadkrzepliwość.Nadkrzepliwość);
	}

}
