package pl.jblew.mm.ch.nefrologiczne;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.ChorobaAutoimmunologiczna;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.NadwrażliwośćTypu2ZależnaOdPrzeciwciał;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu3.NadwrażliwośćTypu3KompleksówImmunologicznych;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class PopaciorkowcoweZapalenieKłębuszkówNerkowych extends Choroba implements ChorobaAutoimmunologiczna {
	public static final PopaciorkowcoweZapalenieKłębuszkówNerkowych PopaciorkowcoweZapalenieKłębuszkówNerkowych = new PopaciorkowcoweZapalenieKłębuszkówNerkowych();

	protected PopaciorkowcoweZapalenieKłębuszkówNerkowych() {
		_constructor();
	}

	@Override
	public String docelowyAntygen() {
		return "Antygeny ściany paciorkowców zagnieżdżają się w błonie podstawnej kłębuszków nerkowych.";
	}

	@Override
	public String mechanizmNiszczenia() {
		return NadwrażliwośćTypu3KompleksówImmunologicznych.NadwrażliwośćTypu3KompleksówImmunologicznych.definicja();
	}

	@Override
	public Stan[] przyczyny() {
		return array(new NadwrażliwośćTypu3KompleksówImmunologicznych(
				new NadwrażliwośćTypu2ZależnaOdPrzeciwciał(docelowyAntygen(), mechanizmNiszczenia())));
	}
}