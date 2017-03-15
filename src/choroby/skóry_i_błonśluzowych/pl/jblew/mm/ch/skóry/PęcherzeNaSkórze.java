package pl.jblew.mm.ch.skóry;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class PęcherzeNaSkórze extends Choroba {
	public static final PęcherzeNaSkórze PęcherzeNaSkórze = new PęcherzeNaSkórze();

	protected PęcherzeNaSkórze() {
		_constructor();
	}

	@Override
	public Stan[] przyczyny() {
		return array(PęcherzycaZwykła.PęcherzycaZwykła);
	}

}