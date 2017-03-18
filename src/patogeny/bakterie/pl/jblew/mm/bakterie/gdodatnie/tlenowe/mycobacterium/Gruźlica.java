package pl.jblew.mm.bakterie.gdodatnie.tlenowe.mycobacterium;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu4.NadwrażliwośćTypu4KomórekT;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class Gruźlica extends Choroba {
	public static final Gruźlica Gruźlica = new Gruźlica();

	protected Gruźlica() {
		_constructor();
	}

	@Override
	public Stan[] przyczyny() {
		return array(MycobacteriumTuberculosis.MycobacteriumTuberculosis);
	}

	@Override
	public Stan[] skutki() {
		return array(new NadwrażliwośćTypu4KomórekT("-?-uzupełnić ", "-?-uzupełnić"));
	}

}
