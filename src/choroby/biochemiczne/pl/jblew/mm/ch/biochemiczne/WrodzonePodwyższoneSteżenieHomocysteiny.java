package pl.jblew.mm.ch.biochemiczne;

import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.hemodynamiczne.krzepnięcie.nadkrzepliwość.Nadkrzepliwość;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class WrodzonePodwyższoneSteżenieHomocysteiny extends Choroba {
	public static final WrodzonePodwyższoneSteżenieHomocysteiny WrodzonePodwyższoneSteżenieHomocysteiny = new WrodzonePodwyższoneSteżenieHomocysteiny();

	protected WrodzonePodwyższoneSteżenieHomocysteiny() {
	}

	@Override
	public Stan[] skutki() {
		return array(Nadkrzepliwość.Nadkrzepliwość /* Miażdżyca naczyń */);
	}

}
