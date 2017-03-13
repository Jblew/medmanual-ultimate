package pl.jblew.mm.bakterie.gdodatnie.tlenowe.mycobacterium;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class Trąd extends Choroba {
	public static final Trąd Trąd = new Trąd();

	protected Trąd() {
		_constructor();
	}

	@Override
	public Stan[] przyczyny() {
		return array(MycobacteriumLeprae.MycobacteriumLeprae);
	}

}
