package pl.jblew.mm.ch.skóry;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.antygeny.ObceBiałko;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu3.NadwrażliwośćTypu3KompleksówImmunologicznych;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class ReakcjaArthusa extends Choroba {
	public static final ReakcjaArthusa ReakcjaArthusa = new ReakcjaArthusa();

	protected ReakcjaArthusa() {
		_constructor();
	}

	@Override
	public String definicja() {
		return NadwrażliwośćTypu3KompleksówImmunologicznych.NadwrażliwośćTypu3KompleksówImmunologicznych.definicja();
	}

	@Override
	public Stan[] przyczyny() {
		return array(new NadwrażliwośćTypu3KompleksówImmunologicznych(ObceBiałko.ObceBiałko));
	}

}