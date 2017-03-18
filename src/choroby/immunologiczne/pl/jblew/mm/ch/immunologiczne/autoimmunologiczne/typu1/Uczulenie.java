package pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu1;

import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class Uczulenie extends Choroba {
	public static final Uczulenie Uczulenie = new Uczulenie();

	protected Uczulenie() {
	}

	@Override
	public Stan[] przyczyny() {
		return array(new NadwrażliwośćTypu1Natychmiastowa("Różne antygeny środowiskowe",
				"W nadwrażliwości typu pierwszego nie ma niszczenia komórek."));
	}
}
