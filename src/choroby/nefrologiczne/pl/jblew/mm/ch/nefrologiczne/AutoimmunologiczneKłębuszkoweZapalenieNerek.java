package pl.jblew.mm.ch.nefrologiczne;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu3.NadwrażliwośćTypu3KompleksówImmunologicznych;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class AutoimmunologiczneKłębuszkoweZapalenieNerek extends Choroba {
	public static final AutoimmunologiczneKłębuszkoweZapalenieNerek AutoimmunologiczneKłębuszkoweZapalenieNerek = new AutoimmunologiczneKłębuszkoweZapalenieNerek();

	protected AutoimmunologiczneKłębuszkoweZapalenieNerek() {
		_constructor();
	}

	@Override
	public Stan[] przyczyny() {
		return array(NadwrażliwośćTypu3KompleksówImmunologicznych.NadwrażliwośćTypu3KompleksówImmunologicznych);
	}

}
