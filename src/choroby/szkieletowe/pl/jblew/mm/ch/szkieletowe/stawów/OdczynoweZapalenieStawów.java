package pl.jblew.mm.ch.szkieletowe.stawów;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.ChorobaAutoimmunologiczna;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu3.NadwrażliwośćTypu3KompleksówImmunologicznych;
import pl.jblew.mm.typy.Stan;

public class OdczynoweZapalenieStawów extends ZapalenieStawów implements ChorobaAutoimmunologiczna {
	public static final OdczynoweZapalenieStawów OdczynoweZapalenieStawów = new OdczynoweZapalenieStawów();

	protected OdczynoweZapalenieStawów() {
		_constructor();
	}

	@Override
	public Stan[] przyczyny() {
		return array(NadwrażliwośćTypu3KompleksówImmunologicznych.NadwrażliwośćTypu3KompleksówImmunologicznych);
	}

	@Override
	public String docelowyAntygen() {
		return "Antygeny bakteryjne powodują aktywację reakcji zapalnych w przestrzeni stawowej.";
	}

	@Override
	public String mechanizmNiszczenia() {
		return NadwrażliwośćTypu3KompleksówImmunologicznych.NadwrażliwośćTypu3KompleksówImmunologicznych.definicja();
	}
}
