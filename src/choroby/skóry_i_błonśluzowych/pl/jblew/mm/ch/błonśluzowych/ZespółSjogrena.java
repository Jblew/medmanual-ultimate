package pl.jblew.mm.ch.błonśluzowych;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu4.NadwrażliwośćTypu4KomórekT;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.typy.Stan;

public class ZespółSjogrena extends Choroba {
	public static final ZespółSjogrena ZespółSjogrena = new ZespółSjogrena();

	protected ZespółSjogrena() {
		_constructor();
	}

	@Override
	public Stan[] przyczyny() {
		return array(new NadwrażliwośćTypu4KomórekT(docelowyAntygen(), mechanizmNiszczenia()));
	}

	public String docelowyAntygen() {
		throw new NotImplementedYetException();
	}

	public String mechanizmNiszczenia() {
		throw new NotImplementedYetException();
	}

	@Override
	public Stan[] skutki() {
		return array(SuchośćOczu.SuchośćOczu, SuchośćWUstach.SuchośćWUstach);
	}

}
