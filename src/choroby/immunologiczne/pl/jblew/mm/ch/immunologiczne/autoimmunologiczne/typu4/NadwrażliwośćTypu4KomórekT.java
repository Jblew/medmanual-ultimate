package pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu4;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.bakterie.gdodatnie.tlenowe.mycobacterium.Gruźlica;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.Nadwrażliwość;
import pl.jblew.mm.typy.Stan;

public class NadwrażliwośćTypu4KomórekT extends Nadwrażliwość {
	public static final NadwrażliwośćTypu4KomórekT NadwrażliwośćTypu4KomórekT = new NadwrażliwośćTypu4KomórekT();

	protected NadwrażliwośćTypu4KomórekT() {
		_constructor();
	}

	@Override
	public Stan[] jestKomponentąDla() {
		return array(Gruźlica.Gruźlica);
	}

}
