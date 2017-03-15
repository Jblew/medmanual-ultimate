package pl.jblew.mm.ch.błonśluzowych;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class SuchośćWUstach extends Choroba {
	public static final SuchośćWUstach SuchośćWUstach = new SuchośćWUstach();

	protected SuchośćWUstach() {
		_constructor();
	}

	@Override
	public Stan[] przyczyny() {
		return array(ZespółSjogrena.ZespółSjogrena);
	}

}
