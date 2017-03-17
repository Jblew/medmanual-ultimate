package pl.jblew.mm.ch.szkieletowe.stawów;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.ChorobaAutoimmunologiczna;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.NadwrażliwośćTypu2ZależnaOdPrzeciwciał;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu3.NadwrażliwośćTypu3KompleksówImmunologicznych;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu4.NadwrażliwośćTypu4KomórekT;
import pl.jblew.mm.typy.Stan;

public class ReumatoidalneZapalenieStawów extends ZapalenieStawów implements ChorobaAutoimmunologiczna {
	public static final ReumatoidalneZapalenieStawów ReumatoidalneZapalenieStawów = new ReumatoidalneZapalenieStawów();

	protected ReumatoidalneZapalenieStawów() {
		_constructor();
	}

	@Override
	public String docelowyAntygen() {
		return "Komórki T przeciw kolagenowi? lub krążącym własnym białkom? – niepotwierdzone. "
				+ "Przeciwciała i krążące antygeny też się przyczyniają.";
	}

	@Override
	public String mechanizm() {
		return "Zapalenie kontrolowane przez cytokiny z Th17 (i Th1?). Przeciwciała i kompleksy "
				+ "immunologiczne też mają rolę.";
	}

	@Override
	public Stan[] maKomponenty() {
		return array(NadwrażliwośćTypu4KomórekT.NadwrażliwośćTypu4KomórekT,
				NadwrażliwośćTypu2ZależnaOdPrzeciwciał.NadwrażliwośćTypu2ZależnaOdPrzeciwciał,
				NadwrażliwośćTypu3KompleksówImmunologicznych.NadwrażliwośćTypu3KompleksówImmunologicznych);
	}

	@Override
	public Stan[] skutki() {
		return array(ZapalenieStawów, stan("Niszczenie chrząstki stawowej oraz kości"));
	}

}
