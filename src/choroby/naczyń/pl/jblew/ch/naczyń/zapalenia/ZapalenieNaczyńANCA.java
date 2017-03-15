package pl.jblew.ch.naczyń.zapalenia;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.ChorobaAutoimmunologiczna;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.NadwrażliwośćTypu2ZależnaOdPrzeciwciał;
import pl.jblew.mm.typy.Stan;

public class ZapalenieNaczyńANCA extends ZapalenieNaczyń implements ChorobaAutoimmunologiczna {
	public static final ZapalenieNaczyńANCA ZapalenieNaczyńANCA = new ZapalenieNaczyńANCA();

	protected ZapalenieNaczyńANCA() {
		_constructor();
	}

	@Override
	public String docelowyAntygen() {
		return "Białka ziarnistości neutrofilów. Prawdopodobnie uwalniane z aktywowanych neutrofilów.";
	}

	@Override
	public String mechanizm() {
		return "Degranulacja neutrofilów --> Zapalenie";
	}

	@Override
	public Stan[] maKomponenty() {
		return array(NadwrażliwośćTypu2ZależnaOdPrzeciwciał.NadwrażliwośćTypu2ZależnaOdPrzeciwciał);
	}
}
