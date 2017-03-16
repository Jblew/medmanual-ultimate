package pl.jblew.mm.wirusy.picornawirusy.enterowirusy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class WirusyCoxsackie extends Enterowirus {
	public static final WirusyCoxsackie WirusyCoxsackie = new WirusyCoxsackie();

	protected WirusyCoxsackie() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Gatunki: COX-A, COX-B\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "## Coxsackie A\n"
				+ "\n"
				+ "Coxsackie A powoduje całą gamę chorób:\n"
				+ "\n"
				+ "1.    Herpangina\n"
				+ "2.    Zapalenie gardła\n"
				+ "\n"
				+ "\n"
				+ "3.    Zespół ręki-stopy-ust\n"
				+ "\n"
				+ "\n"
				+ "4.    Przeziębienia, choroby gorączkowe\n"
				+ "5.    ZOMR\n"
				+ "6.    Ostre krwotoczne zapalenie spojówek\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "### Herpangina\n"
				+ "\n"
				+ "**Herpangina** to zapalenie tylnej części jamy ustnej i gardła. W gardle występują liczne grudkowate zmiany (1-2mm pęcherzyki z szarym środkiem, otoczone zapalną obwódką) – gardło jest bolesne. Oprócz tego gorączka, złe samopoczucie i brak apetytu. Okres inkubacji to 2-3 dni, choroba trwa 3-6 tygodni. Zmiany znikają same.\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "### Zespół ręki-stopy-ust\n"
				+ "\n"
				+ "**Zespół ręki-stopy-ust** jest powodowany przez wirus Coxsackie A16. Okres\n"
				+ "inkubacji to 5-7 dni, występuje: ból głowy, ból gardła i gorączka, oraz charakterystycznie: żywoczerwone pęcherzyki w jamie ustnej i bolesne pęcherzyki na rękach i stopach. Samowyleczenie.\n"
				+ "\n"

				+ "## Coxsackie B\n"
				+ "\n"
				+ "Wirus Coxsackie B powoduje najczęśniej chorobę **Bornholmską** – pleurodynia epidemica. Może także powodować zespół ręki-stopy-ust, a także może powodować zapalenie trzustki skutkujące cukrzycą insulinozależną.\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "### Choroba Bornholmska\n"
				+ "\n"
				+ "Pleurodynia jest też nazywana chorobą Bornholmską, diabelskimi dreszczami, albo diabelską grypą. Jej objawy to: nagła gorączka i jednostronny ból w KLP. Dodatkowo ból brzucha, wymioty i tkliwość mięśni pozajętej stronie. Trwa 4 dni, możliwe są nawroty, jest epidemiczna. (+różnicuje się ją z zapaleniem opłucnej i otrzewnej).";
	}

	@Override
	public ImageReference[] galeria() {
		return new ImageReference[] { _Image("herpangina.png", "Herpangina"),
				/*
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 */
				_Image("zespol-reki-stopy-ust-1.png", "Zespół ręki-stopy-ust"),
				/*
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 */
				_Image("zespol-reki-stopy-ust-2.png", "Zespół ręki-stopy-ust"),
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
