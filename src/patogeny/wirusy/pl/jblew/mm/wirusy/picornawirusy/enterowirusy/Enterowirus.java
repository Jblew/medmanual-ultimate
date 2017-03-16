package pl.jblew.mm.wirusy.picornawirusy.enterowirusy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.wirusy.picornawirusy.Picornawirus;

public class Enterowirus extends Picornawirus {
	public static final Enterowirus Enterowirus = new Enterowirus();

	protected Enterowirus() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Enterowirusy replikują się w przewodzie pokarmowym, ale go nie zakażają. Dokładnie, to replikują się w błonie śluzowej przewodu pokarmowego i w tkance limfoidalnej migdałków, gardła i w kępkach Peyera."
				+ ""
				+ "Pierwotna wiriemia transportuje je do tkanek limfatycznych poza przewodem pokarmowym: do układu SS wątroby i śledziony, oraz do węzłów chłonnych."
				+ ""
				+ "Wiriemia wtórna powoduje powstanie całego spektrum objawów klinicznych, które są zależne od powinowactwa poszczególnych gatunków."
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ "Enterowirusy szerzą się drogą fekalno-oralną. Wrotami zakażenia jest jama ustna i górne drogi oddechowe. Wydalanie wirusów jest często bezobjawowe. Inaktywuje je dopiero temperatura 50*C."
				+ ""
				+ ""
				+ ""
				+ "Enterowirusy mogą się namnażać w pp, ponieważ są oporne na kwas żołądkowy, żółć i proteazy."
				+ ""
				+ ""
				+ ""
				+ "Dzieci przechodzą lżej niż dorośli. Oprócz noworodków i wcześniaków, oczywiście.";
	}
}
