package pl.jblew.mm.ch.nefrologiczne;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.ChorobaAutoimmunologiczna;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.NadwrażliwośćTypu2ZależnaOdPrzeciwciał;
import pl.jblew.mm.typy.Stan;

public class ChorobaGoodpasteurea extends NadwrażliwośćTypu2ZależnaOdPrzeciwciał implements ChorobaAutoimmunologiczna {
	public static final ChorobaGoodpasteurea ChorobaGoodpasteurea = new ChorobaGoodpasteurea();

	protected ChorobaGoodpasteurea() {
		_constructor();
	}

	@Override
	public String docelowyAntygen() {
		return "NCI (Niekolagenowe białka) w błonie podstawnej kłębuszków nerkowych i pęcherzyków płucnych.";
	}

	@Override
	public String mechanizm() {
		return "Zapalenie wywołane przez dopełanicz i receptor Fc";
	}

	@Override
	public Stan[] maKomponenty() {
		return array(NadwrażliwośćTypu2ZależnaOdPrzeciwciał.NadwrażliwośćTypu2ZależnaOdPrzeciwciał);
	}
}
