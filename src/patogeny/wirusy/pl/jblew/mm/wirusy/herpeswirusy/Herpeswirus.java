package pl.jblew.mm.wirusy.herpeswirusy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.adnotacje.Image;
import pl.jblew.mm.wirusy.Wirus;

public class Herpeswirus extends Wirus {
	public static final Herpeswirus Herpeswirus = new Herpeswirus();

	protected Herpeswirus() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "- HHV1, HHV2 = [HSV1, HSV2](./Wirusy opryszczki zwykłej (HSV).md)"
				+ ""
				+ "  - [Opryszczka zwykła](../../Choroby i objawy/Infekcje ogólne/Opryszczka zwykła.md)"
				+ ""
				+ ""
				+ "- HHV3 = [VZV](./Wirus ospy wietrznej i półpaśca (VZV).md)"
				+ ""
				+ "  - [Ospa wietrzna i półpasiec](../../Choroby i objawy/Infekcje ogólne/Ospa wietrzna i półpasiec.md)"
				+ ""
				+ ""
				+ "- HHV4 [EBV](./Wirus Epstein-Barr (EBV).md)"
				+ ""
				+ "  - [Mononukleoza zakaźna](../../Choroby i objawy/Infekcje ogólne/Mononukleoza zakaźna.md)"
				+ ""
				+ ""
				+ "- HHV5 = [CMV](./Wirus cytomegalii (CMV).md)"
				+ ""
				+ "  - [Zespół mononukleozopodobny](../../Choroby i objawy/Infekcje ogólne/Mononukleoza zakaźna.md)"
				+ "  - [Choroba wtrętowa](../../Choroby i objawy/Infekcje ogólne/Choroba wtrętowa.md) noworodków (= wrodzone zakażenie CMV)"
				+ "- HHV6, HHV7 = [Wirusy T-limfotropowe HHV6, HHV7](./Wirusy T-limfotropowe (HHV6-HHV7).md)"
				+ "  - Rumień nagły - opisany w:  [Wirusy T-limfotropowe HHV6, HHV7](./Wirusy T-limfotropowe (HHV6-HHV7).md)"
				+ "  - [Zespół mononukleozopodobny](../../Choroby i objawy/Infekcje ogólne/Mononukleoza zakaźna.md)"
				+ "- HHV8 = [KSHV](./Wirus mięsaka Kaposiego (KSHV).md)"
				+ ""
				+ ""
				+ ""
				+ ""
				+ "## Charakterystyka"
				+ ""
				+ "dsDNA, osłonkowe"
				+ ""
				+ "Otoczka fuzuje z błoną komórki przy wnikaniu."
				+ ""
				+ ""

				+ "## Cykl i zakażenie"
				+ ""
				+ "Herpeswirusy powodują tym silniejsze objawy, im gorszy jeststan układu odpornościowego (drabina zaburzeń odporności)."
				+ ""
				+ "Herpeswirusy są wirusami **latentnymi**. Większość zakażeń pierwotnych jest bezobjawowa. Reaktywacjemogą być wielokrotne. Latencja zachodzi w mechanizmie chromatynizacji genomuwirusa (tj. DNA, a dokładniej miniplazmidy - episomy wirusa wiążą się zhistonami komórki)."
				+ ""
				+ "Herpeswirusy wykazują określony tropizm tkankowy. HSV1, HSV2to wirusy neurotropowe. CMV, HHV6 i HHV7 to wirusy T-limfotropowe. EBV i KSHVto wirusy B-limfotropowe."
				+ ""
				+ "Herpeswirusy skutecznie bronią się przez układemodpornościowym: supresja proliferacji limfocytów, hamują apoptozę poprzezhamowanie p53 i kaspaz. Hamują proteasomy. Zmniejszają ekspresję białekwirusowych w kontekście MHC."
				+ ""
				+ ""
				+ ""
				+ "## Leczenie"
				+ ""
				+ "#### [Przeciwwirusowe analogi nukleozydowe lub nukleotydowe](../../Farmakologia/Grupy/025 Przeciwwirusowe analogi nukleozydowe lub nukleotydowe.md)"
				+ ""
				+ "-  Acyklowir"
				+ "   -  HSV1, HSV2"
				+ "   -  VZV"
				+ "   -  CMV"
				+ "   -  EBV"
				+ "-  Walacyklowir"
				+ "   -  VZV"
				+ "-  ~~Pencyklowir~~"
				+ "   -  ?"
				+ "-  Famcyklowir"
				+ "   -  VZV, HSV"
				+ "-  Gancyklowir (wskazania jak acyklowir, ale dużo silniejszy i bardziej toksyczny od acyklowiru)"
				+ "   -  HSV1, HSV2"
				+ "   -  VZV"
				+ "   -  CMV"
				+ "   -  EBV"
				+ "-  ~~Widarabina~~"
				+ "   -  HSV1, HSV2"
				+ "   -  EBV"
				+ "   -  Słabo CMV"
				+ ""
				+ ""
				+ ""
				+ "#### [Foskarnet](../../Farmakologia/Grupy/028 Foskarnet.md)"
				+ ""
				+ "-  HSV"
				+ "-  VZV"
				+ "-  CMV"
				+ "-  EBV"
				+ "-  HHV-6";

	}

	@Image(url = "herpeswirusy-epidemiologia.png") /*
													
													
													
													
													
													
													
													
													
													
													
													
													
													
													
													
													*/
	public String epidemiologia() {
		return "Ludzkie herpeswirusy są szeroko rozpowszechnione w populacji. Większość zakażeń przebiega "
				+ "bezobjawowo u osób immunokompetentnych. KSHV i HHV6 są onkogenne. Dla wszystkich z niżej "
				+ "wymienionych wirusów (oprócz KSHV i HSV-2) ponad 50% populacji jest seropozytywna. "
				+ "Wirus HSV1 przenosi się przez kontakt bezpośredni. HSV2  i KSHV (HHV8) przenoszą się "
				+ "przez kontakty płciowe. VZV (HHV3) przenosi się drogą kropelkową. "
				+ "Pozostałe (EBV, CMV, HHV6, HHV7) przenoszą się śliną.";
	}
}
