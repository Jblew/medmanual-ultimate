package pl.jblew.mm.ch.immunologiczne.przeszczepy;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;
import pl.jblew.mm.zabiegi.Transplantacja;

public class OdrzuceniePrzeszczepu extends Choroba {
	public static final OdrzuceniePrzeszczepu OdrzuceniePrzeszczepu = new OdrzuceniePrzeszczepu();

	protected OdrzuceniePrzeszczepu() {
		_constructor();
	}

	@Override
	public Stan[] przyczyny() {
		return array(Transplantacja.Transplantacja);
	}

}