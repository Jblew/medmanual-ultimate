package pl.jblew.mm.ch.kardiologiczne.zapalenia;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.badania.krwi.enzymatyczne.AktywnośćDehydrogenazyMleczanowej;
import pl.jblew.mm.bakterie.gujemne.krętki.BorreliaSpp.BorreliaBurgdorferi;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class ZapalenieMięśniaSercowego extends Choroba {
	public static final ZapalenieMięśniaSercowego ZapalenieMięśniaSercowego = new ZapalenieMięśniaSercowego();

	protected ZapalenieMięśniaSercowego() {
		_constructor();
	}

	@Override
	public Stan[] przyczyny() {
		return array(GorączkaReumatyczna.GorączkaReumatyczna, BorreliaBurgdorferi.BorreliaBurgdorferi);
	}

	@Override
	public Stan[] skutki() {
		return array(AktywnośćDehydrogenazyMleczanowej.Hiper.Hiper);
	}

}