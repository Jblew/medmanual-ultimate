package pl.jblew.mm.ch.krwi;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.ChorobaAutoimmunologiczna;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu3.NadwrażliwośćTypu3KompleksówImmunologicznych;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class ChorobaPosurowicza extends Choroba implements ChorobaAutoimmunologiczna {
	public static final ChorobaPosurowicza ChorobaPosurowicza = new ChorobaPosurowicza();

	protected ChorobaPosurowicza() {
		_constructor();
	}

	@Override
	public String definicja() {
		return NadwrażliwośćTypu3KompleksówImmunologicznych.NadwrażliwośćTypu3KompleksówImmunologicznych.definicja();
	}

	@Override
	public Stan[] maKomponenty() {
		return array(NadwrażliwośćTypu3KompleksówImmunologicznych.NadwrażliwośćTypu3KompleksówImmunologicznych);
	}

	@Override
	public String docelowyAntygen() {
		return "Różne obce białka zawarte w podawanej surowicy. Np. końska globulina przeciwgrasicza";
	}

	@Override
	public String mechanizm() {
		return NadwrażliwośćTypu3KompleksówImmunologicznych.NadwrażliwośćTypu3KompleksówImmunologicznych.definicja();
	}
}
