package pl.jblew.mm.ch.błonśluzowych;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.ChorobaAutoimmunologiczna;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu4.NadwrażliwośćTypu4KomórekT;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.typy.Stan;

public class ZespółSjogrena extends Choroba implements ChorobaAutoimmunologiczna {
	public static final ZespółSjogrena ZespółSjogrena = new ZespółSjogrena();

	protected ZespółSjogrena() {
		_constructor();
	}

	@Override
	public Stan[] maKomponenty() {
		return array(NadwrażliwośćTypu4KomórekT.NadwrażliwośćTypu4KomórekT);
	}

	@Override
	public String docelowyAntygen() {
		throw new NotImplementedYetException();
	}

	@Override
	public String mechanizm() {
		throw new NotImplementedYetException();
	}

	@Override
	public Stan[] skutki() {
		return array(SuchośćOczu.SuchośćOczu, SuchośćWUstach.SuchośćWUstach);
	}

}
