package pl.jblew.mm.ch.skóry;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu4.NadwrażliwośćTypu4KomórekT;
import pl.jblew.mm.typy.Stan;

public class KontaktoweZapalenieSkóry extends ZapalenieSkóry {
	public static final KontaktoweZapalenieSkóry KontaktoweZapalenieSkóry = new KontaktoweZapalenieSkóry();

	protected KontaktoweZapalenieSkóry() {
		_constructor();
	}

	public String docelowyAntygen() {
		return "Różne związki środowiskowe";
	}

	public String mechanizmNiszczenia() {
		return "Kontrolowane głównie przez cytokiny z Th1.";
	}

	@Override
	public Stan[] przyczyny() {
		return array(new NadwrażliwośćTypu4KomórekT(docelowyAntygen(), mechanizmNiszczenia()));
	}

	@Override
	public Stan[] skutki() {
		return array(stan("Martwica naskórka"), stan("Zapalenie skóry z zaczerwienieniem skóry oraz pęcherzami"));
	}

}
