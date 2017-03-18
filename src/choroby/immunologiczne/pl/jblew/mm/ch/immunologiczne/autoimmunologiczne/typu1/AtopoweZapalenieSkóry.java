package pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu1;

import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class AtopoweZapalenieSkóry extends Choroba {
	public static final AtopoweZapalenieSkóry AtopoweZapalenieSkóry = new AtopoweZapalenieSkóry();

	protected AtopoweZapalenieSkóry() {
	}

	@Override
	public Stan[] przyczyny() {
		return array(new NadwrażliwośćTypu1Natychmiastowa("Antygeny środowiskowe", "-?-uzupełnić"));
	}

}
