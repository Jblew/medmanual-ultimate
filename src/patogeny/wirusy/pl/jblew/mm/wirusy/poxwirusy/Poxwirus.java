package pl.jblew.mm.wirusy.poxwirusy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.wirusy.Wirus;

public class Poxwirus extends Wirus {
	public static final Poxwirus Poxwirus = new Poxwirus();

	protected Poxwirus() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "dsDNA, czasem osłonkowe, czasem nagi kapsyd\n"
				+ "Poxwirusy mają własne enzymy do replikacji, replikują się tylko w cytoplazmie, niemniej w komórkach bezjądrowych replikacja zatrzymuje się na etapie dojrzewania wirionów.\n";
	}
}
