package pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu1;

import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class AtopowaAstmaOskrzelowa extends Choroba {
	public static final AtopowaAstmaOskrzelowa AtopowaAstmaOskrzelowa = new AtopowaAstmaOskrzelowa();

	protected AtopowaAstmaOskrzelowa() {
	}

	@Override
	public Stan[] przyczyny() {
		return array(new NadwrażliwośćTypu1Natychmiastowa("Antygeny środowiskowe", "-?-uzupełnić"));
	}

}
