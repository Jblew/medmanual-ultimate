package pl.jblew.mm.wirusy.polyomawirusy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.wirusy.Wirus;

public class Polyomawirus extends Wirus {
	public static final Polyomawirus Polyomawirus = new Polyomawirus();

	protected Polyomawirus() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "dsDNA, nagi kapsyd. U immunokompetentnych osób zakażenie pierwotne jest prawie zawsze bezobjawowe, ale występuje zjawisko latencji. Wirus wchodzi w cykl latentny i może się uaktywnić. Występują poliomawirusy: BK, JC, WU, KI, MC.";
	}
}
