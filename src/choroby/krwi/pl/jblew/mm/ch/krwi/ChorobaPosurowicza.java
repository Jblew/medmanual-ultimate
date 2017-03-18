package pl.jblew.mm.ch.krwi;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.antygeny.ObceBiałko;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu3.NadwrażliwośćTypu3KompleksówImmunologicznych;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class ChorobaPosurowicza extends Choroba {
	public static final ChorobaPosurowicza ChorobaPosurowicza = new ChorobaPosurowicza();

	protected ChorobaPosurowicza() {
		_constructor();
	}

	@Override
	public Stan[] przyczyny() {
		return array(new NadwrażliwośćTypu3KompleksówImmunologicznych(kombinacja(ObceBiałko.ObceBiałko,
				stan("Różne obce białka zawarte w podawanej surowicy. Np. końska globulina przeciwgrasicza"))));
	}
}
