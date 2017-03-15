package pl.jblew.mm.ch.nefrologiczne;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.ChorobaAutoimmunologiczna;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu3.NadwrażliwośćTypu3KompleksówImmunologicznych;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class PopaciorkowcoweZapalenieKłębuszkówNerkowych extends Choroba implements ChorobaAutoimmunologiczna {
	public static final PopaciorkowcoweZapalenieKłębuszkówNerkowych PopaciorkowcoweZapalenieKłębuszkówNerkowych = new PopaciorkowcoweZapalenieKłębuszkówNerkowych();

	protected PopaciorkowcoweZapalenieKłębuszkówNerkowych() {
		_constructor();
	}

	@Override
	public Stan[] maKomponenty() {
		return array(NadwrażliwośćTypu3KompleksówImmunologicznych.NadwrażliwośćTypu3KompleksówImmunologicznych);
	}

	@Override
	public String docelowyAntygen() {
		return "Antygeny ściany paciorkowców zagnieżdżają się w błonie podstawnej kłębuszków nerkowych.";
	}

	@Override
	public String mechanizm() {
		return NadwrażliwośćTypu3KompleksówImmunologicznych.NadwrażliwośćTypu3KompleksówImmunologicznych.definicja();
	}
}