package pl.jblew.mm.zabiegi;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.przeszczepy.OdrzuceniePrzeszczepu;
import pl.jblew.mm.typy.Stan;

public class Transplantacja extends Zabieg {
	public static final Transplantacja Transplantacja = new Transplantacja();

	protected Transplantacja() {
		_constructor();
	}

	@Override
	public Stan[] skutki() {
		return array(OdrzuceniePrzeszczepu.OdrzuceniePrzeszczepu);
	}

}
