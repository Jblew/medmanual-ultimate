package pl.jblew.mm.ch.skóry;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.ChorobaAutoimmunologiczna;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu4.NadwrażliwośćTypu4KomórekT;
import pl.jblew.mm.typy.Stan;

public class KontaktoweZapalenieSkóry extends ZapalenieSkóry implements ChorobaAutoimmunologiczna {
	public static final KontaktoweZapalenieSkóry KontaktoweZapalenieSkóry = new KontaktoweZapalenieSkóry();

	protected KontaktoweZapalenieSkóry() {
		_constructor();
	}

	@Override
	public String docelowyAntygen() {
		return "Różne związki środowiskowe";
	}

	@Override
	public String mechanizm() {
		return "Kontrolowane głównie przez cytokiny z Th1.";
	}

	@Override
	public Stan[] maKomponenty() {
		return array(NadwrażliwośćTypu4KomórekT.NadwrażliwośćTypu4KomórekT);
	}

	@Override
	public Stan[] skutki() {
		return array(stan("Martwica naskórka"), stan("Zapalenie skóry z zaczerwienieniem skóry oraz pęcherzami"));
	}

}
