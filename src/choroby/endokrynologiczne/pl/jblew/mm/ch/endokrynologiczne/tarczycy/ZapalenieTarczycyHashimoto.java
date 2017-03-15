package pl.jblew.mm.ch.endokrynologiczne.tarczycy;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.ChorobaAutoimmunologiczna;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu4.NadwrażliwośćTypu4KomórekT;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Skutek;
import pl.jblew.mm.typy.Stan;

public class ZapalenieTarczycyHashimoto extends Choroba implements ChorobaAutoimmunologiczna {
	public static final ZapalenieTarczycyHashimoto ZapalenieTarczycyHashimoto = new ZapalenieTarczycyHashimoto();

	protected ZapalenieTarczycyHashimoto() {
		_constructor();
	}

	@Override
	public String docelowyAntygen() {
		return "Tyreoglobulina, inne białka tarczycy";
	}

	@Override
	public String mechanizm() {
		return "Zabijanie komórek nabłonka tarczycy przez CTL";
	}

	@Override
	public Stan[] maKomponenty() {
		return array(NadwrażliwośćTypu4KomórekT.NadwrażliwośćTypu4KomórekT);
	}

	@Override
	public Stan[] skutki() {
		return array(new Skutek("Niedoczynność tarczycy"));
	}
}
