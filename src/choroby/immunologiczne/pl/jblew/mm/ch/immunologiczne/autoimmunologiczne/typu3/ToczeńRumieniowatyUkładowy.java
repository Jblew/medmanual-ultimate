package pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu3;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.NadwrażliwośćTypu2ZależnaOdPrzeciwciał;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class ToczeńRumieniowatyUkładowy extends Choroba {
	public static final ToczeńRumieniowatyUkładowy ToczeńRumieniowatyUkładowy = new ToczeńRumieniowatyUkładowy();

	protected ToczeńRumieniowatyUkładowy() {
		_constructor();
	}

	@Override
	public String definicja() {
		return NadwrażliwośćTypu3KompleksówImmunologicznych.NadwrażliwośćTypu3KompleksówImmunologicznych.definicja();
	}

	@Override
	public Stan[] przyczyny() {
		return array(new NadwrażliwośćTypu3KompleksówImmunologicznych(new NadwrażliwośćTypu2ZależnaOdPrzeciwciał(
				"Antygeny jądrowe. (Przeciwciała ANA to przeciwciała przerciwjądrowe)",
				"Mechanizm nadwrażliwości typu 3")));
	}

}