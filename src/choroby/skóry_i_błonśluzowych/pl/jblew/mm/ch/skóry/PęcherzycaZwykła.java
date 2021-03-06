package pl.jblew.mm.ch.skóry;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.NadwrażliwośćTypu2ZależnaOdPrzeciwciał;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class PęcherzycaZwykła extends Choroba {
	public static final PęcherzycaZwykła PęcherzycaZwykła = new PęcherzycaZwykła();

	protected PęcherzycaZwykła() {
		_constructor();
	}

	@Override
	public Stan[] skutki() {
		return array(PęcherzeNaSkórze.PęcherzeNaSkórze);
	}

	@Override
	public String definicja() {
		return NadwrażliwośćTypu2ZależnaOdPrzeciwciał.NadwrażliwośćTypu2ZależnaOdPrzeciwciał.definicja();
	}

	public String docelowyAntygen() {
		return "Desmogleina naskórka";
	}

	public String mechanizmNiszczenia() {
		return "Zależna od przeciwciał aktywacja proteaz";
	}

	@Override
	public Stan[] przyczyny() {
		return array(new NadwrażliwośćTypu2ZależnaOdPrzeciwciał(docelowyAntygen(), mechanizmNiszczenia()));
	}
}