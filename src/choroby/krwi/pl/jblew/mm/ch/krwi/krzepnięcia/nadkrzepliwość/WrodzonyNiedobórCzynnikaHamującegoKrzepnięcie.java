package pl.jblew.mm.ch.krwi.krzepnięcia.nadkrzepliwość;

import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class WrodzonyNiedobórCzynnikaHamującegoKrzepnięcie extends Choroba {
	public static final WrodzonyNiedobórCzynnikaHamującegoKrzepnięcie WrodzonyNiedobórCzynnikaHamującegoKrzepnięcie = new WrodzonyNiedobórCzynnikaHamującegoKrzepnięcie();

	protected WrodzonyNiedobórCzynnikaHamującegoKrzepnięcie() {
	}

	@Override
	public Stan[] skutki() {
		return array(Nadkrzepliwość.Nadkrzepliwość);
	}

}
