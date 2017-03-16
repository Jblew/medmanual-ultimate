package pl.jblew.mm.wirusy.parvowirusy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class B19 extends Parvowirus {
	public static final B19 B19 = new B19();

	protected B19() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Wirus B19 powoduje **chorobę piątą = rumień zakaźny** (piąta co do popularności dziecięca choroba zakaźna). Objawy choroby piątej:"
				+ ""
				+ "1. Niewysoka gorączka"
				+ "2. Objawy zakażenia górnych dróg oddechowych"
				+ ""
				+ "4. Po 7-10 dniach znika wysypka, a pojawiają się bóle głowy i mięśni"
				+ ""
				+ "Drugą chorobą z objawem skórnym, którą powoduje B19 jest zespół rękawiczek i skarpetek."
				+ ""
				+ ""
				+ ""
				+ ""
				+ "Wirus B19 może też powodować zapalenie stawów i bóle artretyczne u dorosłych, a także przełom aplastyczny u osób chorych na choroby hematologiczne."
				+ ""
				+ "Zakażenie wewnątrzmaciczne może być przyczyną poronienia."
				+ ""
				+ "Wirus B19 jest przenoszony drogą kropelkową. Rumień zakaźny (choroba piąta) występuje na całym świecie. Epidemie obserwuje się wiosną, co 4-5 lat u dzieci szkolnych i młodzieży. (Diagnozę potwierdza się przez wykrycie DNA we krwi lub przeciwciał IgM/IgG).";
	}

	@Override
	public ImageReference[] galeria() {
		return new ImageReference[] { _Image("zespol-rekawiczek-i-skarpetek.png", "Zespół rękawiczek i skarpetek"),
				/*
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 */
		};
	}

}