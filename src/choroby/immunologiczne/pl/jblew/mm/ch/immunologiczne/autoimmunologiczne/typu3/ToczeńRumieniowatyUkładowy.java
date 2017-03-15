package pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu3;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.ChorobaAutoimmunologiczna;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.NadwrażliwośćTypu2ZależnaOdPrzeciwciał;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class ToczeńRumieniowatyUkładowy extends Choroba implements ChorobaAutoimmunologiczna {
	public static final ToczeńRumieniowatyUkładowy ToczeńRumieniowatyUkładowy = new ToczeńRumieniowatyUkładowy();

	protected ToczeńRumieniowatyUkładowy() {
		_constructor();
	}

	@Override
	public String definicja() {
		return NadwrażliwośćTypu3KompleksówImmunologicznych.NadwrażliwośćTypu3KompleksówImmunologicznych.definicja();
	}

	@Override
	public Stan[] maKomponenty() {
		return array(NadwrażliwośćTypu2ZależnaOdPrzeciwciał.NadwrażliwośćTypu2ZależnaOdPrzeciwciał,
				NadwrażliwośćTypu3KompleksówImmunologicznych.NadwrażliwośćTypu3KompleksówImmunologicznych);
	}

	@Override
	public String docelowyAntygen() {
		return "Antygeny jądrowe. (Przeciwciała ANA to przeciwciała przerciwjądrowe)";
	}

	@Override
	public String mechanizm() {
		return NadwrażliwośćTypu3KompleksówImmunologicznych.NadwrażliwośćTypu3KompleksówImmunologicznych.definicja();
	}
}