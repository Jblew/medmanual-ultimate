package pl.jblew.mm.ch.kardiologiczne.zapalenia;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.ChorobaAutoimmunologiczna;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.NadwrażliwośćTypu2ZależnaOdPrzeciwciał;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu4.NadwrażliwośćTypu4KomórekT;
import pl.jblew.mm.typy.Stan;

public class AutoimmunologiczneZapalenieMieśniaSercowego extends ZapalenieMięśniaSercowego
		implements ChorobaAutoimmunologiczna {
	public static final AutoimmunologiczneZapalenieMieśniaSercowego AutoimmunologiczneZapalenieMieśniaSercowego = new AutoimmunologiczneZapalenieMieśniaSercowego();

	protected AutoimmunologiczneZapalenieMieśniaSercowego() {
		_constructor();
	}

	@Override
	public String docelowyAntygen() {
		return "Białko łańcucha ciężkiego miozyny";
	}

	@Override
	public String mechanizm() {
		return "Komórki CTL zabijają kardiomiocyty. Kontrolowane głównie przez cytokiny z Th1.";
	}

	@Override
	public Stan[] maKomponenty() {
		return array(NadwrażliwośćTypu4KomórekT.NadwrażliwośćTypu4KomórekT);
	}
}
