package pl.jblew.mm.ch.endokrynologiczne.tarczycy;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.ChorobaAutoimmunologiczna;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.NadwrażliwośćTypu2ZależnaOdPrzeciwciał;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class ChorobaGravesa extends Choroba implements ChorobaAutoimmunologiczna {
	public static final ChorobaGravesa ChorobaGravesa = new ChorobaGravesa();

	protected ChorobaGravesa() {
		_constructor();
	}

	@Override
	public String definicja() {
		return NadwrażliwośćTypu2ZależnaOdPrzeciwciał.NadwrażliwośćTypu2ZależnaOdPrzeciwciał.definicja();
	}

	@Override
	public String docelowyAntygen() {
		return "Receptor dla TSH";
	}

	@Override
	public String mechanizm() {
		return "Przeciwciała STYMULUJĄ receptor dla TSH na komórkach tarczycy";
	}

	@Override
	public Stan[] maKomponenty() {
		return array(NadwrażliwośćTypu2ZależnaOdPrzeciwciał.NadwrażliwośćTypu2ZależnaOdPrzeciwciał);
	}
}