package pl.jblew.mm.ch.nefrologiczne;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.NadwrażliwośćTypu2ZależnaOdPrzeciwciał;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class ChorobaGoodpasteurea extends Choroba {
	public static final ChorobaGoodpasteurea ChorobaGoodpasteurea = new ChorobaGoodpasteurea();

	protected ChorobaGoodpasteurea() {
		_constructor();
	}

	public String docelowyAntygen() {
		return "NCI (Niekolagenowe białka) w błonie podstawnej kłębuszków nerkowych i pęcherzyków płucnych.";
	}

	public String mechanizmNiszczenia() {
		return "Zapalenie wywołane przez dopełanicz i receptor Fc";
	}

	@Override
	public Stan[] przyczyny() {
		return array(new NadwrażliwośćTypu2ZależnaOdPrzeciwciał(docelowyAntygen(), mechanizmNiszczenia()));
	}
}
