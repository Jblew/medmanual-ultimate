package pl.jblew.ch.naczyń.zapalenia;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.NadwrażliwośćTypu2ZależnaOdPrzeciwciał;
import pl.jblew.mm.typy.Stan;

public class ZapalenieNaczyńANCA extends ZapalenieNaczyń {
	public static final ZapalenieNaczyńANCA ZapalenieNaczyńANCA = new ZapalenieNaczyńANCA();

	protected ZapalenieNaczyńANCA() {
		_constructor();
	}

	public String docelowyAntygen() {
		return "Białka ziarnistości neutrofilów. Prawdopodobnie uwalniane z aktywowanych neutrofilów.";
	}

	public String mechanizmNiszczenia() {
		return "Degranulacja neutrofilów --> Zapalenie";
	}

	@Override
	public Stan[] przyczyny() {
		return array(new NadwrażliwośćTypu2ZależnaOdPrzeciwciał(docelowyAntygen(), mechanizmNiszczenia()));
	}
}
