package pl.jblew.mm.ch.immunologiczne.grasica;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.niedobory.pierwotne.odpowiedzinabytej.ZespółDiGeorgea;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class HipoplazjaGrasicy extends Choroba {
	public static final HipoplazjaGrasicy HipoplazjaGrasicy = new HipoplazjaGrasicy();

	protected HipoplazjaGrasicy() {
		_constructor();
	}

	@Override
	public Stan[] skutki() {
		return array(ZespółDiGeorgea.ZespółDiGeorgea);
	}

}
