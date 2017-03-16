package pl.jblew.mm.ch.immunologiczne.autoimmunologiczne;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.ChorobaAutoimmunologiczna;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu3.ToczeńRumieniowatyUkładowy;
import pl.jblew.mm.ch.mięśni.miopatie.zapalne.ZapalenieWielomięśniowe;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class MieszanaChorobaTkankiŁącznej extends Choroba implements ChorobaAutoimmunologiczna {
	public static final MieszanaChorobaTkankiŁącznej MieszanaChorobaTkankiŁącznej = new MieszanaChorobaTkankiŁącznej();

	protected MieszanaChorobaTkankiŁącznej() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Określenia \"mieszana choroba tkanki łącznej\" używa się do określania choroby, która ma wspólne"
				+ " cechy SLE, Zapalenia wielomięśniowego i twardziny uogólnionej.";
	}

	@Override
	public Stan[] maKomponenty() {
		return array(ToczeńRumieniowatyUkładowy.ToczeńRumieniowatyUkładowy,
				ZapalenieWielomięśniowe.ZapalenieWielomięśniowe, Twardzina.Twardzina);
	}

	@Override
	public String docelowyAntygen() {
		return "Nie wiadomo";
	}

	@Override
	public String mechanizm() {
		return "Złożony";
	}

}
