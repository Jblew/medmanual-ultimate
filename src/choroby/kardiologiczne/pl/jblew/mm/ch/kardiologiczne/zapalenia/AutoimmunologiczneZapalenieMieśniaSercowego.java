package pl.jblew.mm.ch.kardiologiczne.zapalenia;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu4.NadwrażliwośćTypu4KomórekT;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class AutoimmunologiczneZapalenieMieśniaSercowego extends Choroba {
	public static final AutoimmunologiczneZapalenieMieśniaSercowego AutoimmunologiczneZapalenieMieśniaSercowego = new AutoimmunologiczneZapalenieMieśniaSercowego();

	protected AutoimmunologiczneZapalenieMieśniaSercowego() {
		_constructor();
	}

	public String docelowyAntygen() {
		return "Białko łańcucha ciężkiego miozyny";
	}

	public String mechanizmNiszczenia() {
		return "Komórki CTL zabijają kardiomiocyty. Kontrolowane głównie przez cytokiny z Th1.";
	}

	@Override
	public Stan[] przyczyny() {
		return array(new NadwrażliwośćTypu4KomórekT(docelowyAntygen(), mechanizmNiszczenia()));
	}

	@Override
	public Stan[] skutki() {
		return array(ZapalenieMięśniaSercowego.ZapalenieMięśniaSercowego);
	}

}
