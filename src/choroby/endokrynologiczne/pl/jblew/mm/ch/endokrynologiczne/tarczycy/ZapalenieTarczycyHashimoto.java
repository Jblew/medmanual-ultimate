package pl.jblew.mm.ch.endokrynologiczne.tarczycy;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu4.NadwrażliwośćTypu4KomórekT;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class ZapalenieTarczycyHashimoto extends Choroba {
	public static final ZapalenieTarczycyHashimoto ZapalenieTarczycyHashimoto = new ZapalenieTarczycyHashimoto();

	protected ZapalenieTarczycyHashimoto() {
		_constructor();
	}

	public String docelowyAntygen() {
		return "Tyreoglobulina, inne białka tarczycy";
	}

	public String mechanizmNiszczenia() {
		return "Zabijanie komórek nabłonka tarczycy przez CTL";
	}

	@Override
	public Stan[] skutki() {
		return array(stan("Niedoczynność tarczycy"));
	}

	@Override
	public Stan[] przyczyny() {
		return array(new NadwrażliwośćTypu4KomórekT(docelowyAntygen(), mechanizmNiszczenia()));
	}

}
