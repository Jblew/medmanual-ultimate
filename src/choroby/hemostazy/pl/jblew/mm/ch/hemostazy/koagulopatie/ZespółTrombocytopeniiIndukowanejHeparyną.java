package pl.jblew.mm.ch.hemostazy.koagulopatie;

import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class ZespółTrombocytopeniiIndukowanejHeparyną extends Choroba {
	public static final ZespółTrombocytopeniiIndukowanejHeparyną ZespółTrombocytopeniiIndukowanejHeparyną = new ZespółTrombocytopeniiIndukowanejHeparyną();

	protected ZespółTrombocytopeniiIndukowanejHeparyną() {
	}

	@Override
	public Stan[] skutki() {
		return array(Nadkrzepliwość.Nadkrzepliwość);
	}

}
