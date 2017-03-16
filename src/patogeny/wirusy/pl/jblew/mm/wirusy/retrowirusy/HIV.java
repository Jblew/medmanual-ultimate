package pl.jblew.mm.wirusy.retrowirusy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class HIV extends Retrowirus {
	public static final HIV HIV = new HIV();

	protected HIV() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "## Wirus HIV"
				+ ""
				+ "Wyróżnia się 4 podtypy wirusa HIV-1: **M**(major), **N**(new), **O **(outlier) i **P**(pending), oraz 8 grup wirusa HIV-2, z których najważniejsze są Ai B."
				+ ""
				+ "Są to wirusy ssRNA posiadające własną odwrotną transkryptazę, oraz posiadające osłonkę. "
				+ ""
				+ "Zawiera:"
				+ ""
				+ "1. Dwie identyczne kopie jednoniciowego DNA"
				+ "2. Odwrotną transkryptazę"
				+ ""
				+ ""
				+ ""
				+ "### Cykl replikacyjny"
				+ ""
				+ ""
				+ ""
				+ "Komórkami permisywnymi dla HIV są: limfocyty Th (CD4+), makrofagi/monocyty, kom. Langerhansa, kom. Dendrytyczne, oraz kom. Glejowe (astrocyty i mikroglej)."
				+ ""
				+ "W etapie I gp120/gp41 wirusa łączy się z CD4/CXCR4 komórki permisywnej. Osłonka fuzuje z BK uwalniając nici RNA i odwrotną transkryptazę (RT) do cytoplazmy. Odwrotna transkryptaza syntezuje sscDNA (kompletnie brak mechanizmów naprawczych, oraz jump-reading powodują powstawanie mnóstwa błędów). Powstaje v-dsDNA, która łączy się z integrazą i komórkowym koaktywatorem transkrypcyjnym. Powstaje tzw kompleks PIC. Kompleks PIC przenika przez błonę jądrową. W jądre integraza tworzy grupy hydroksylowe na v-dsSNA, tnie komórkowe DNA i liguje końce v-dsDNA z komórkowym DNA. Powstaje prowirus."
				+ ""
				+ "Etap drugi to ekspresja i proteoliza białek wirusa. W cytoplazmie są wiriony są składane, dojrzewają i są uwalniane."
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ "## Epidemiologia i transmisja"
				+ ""
				+ "### Dezynfekcja"
				+ ""
				+ "Wirus HIV jest wirusem dość stabilnym. Do inaktywacji wymaga"
				+ "autoklawowania, gotowania przez godzinę w 60*C, lub 10 minutowa ekspozycja na"
				+ "popularne środki dezynfekcyjne (etanol, aldehyd glutarowy, podchloryn sodu)."
				+ ""
				+ ""
				+ ""
				+ "### Drogi zakażenia"
				+ ""
				+ "Drogi zakażenia HIV to kontakty seksualne, drogaparenteralna i wertykalna. Zakaźne są: krew, sperma, wydzieliny pochwy iszyjki, oraz mleko kobiece."
				+ ""
				+ "Zakażenie HIV nie szerzy się przez owady krwiopijne."
				+ ""
				+ ""
				+ ""
				+ "## Fazy infekcji HIV"
				+ ""
				+ "Fazy infekcji HIV:"
				+ ""
				+ "1. ARD - ostra choroba retrowirusowa"
				+ "2. Okres bezobjawowy"
				+ "3. AIDS"
				+ ""
				+ "!/[Fazy infekcji hiv](img/fazy-aids.png)"
				+ ""
				+ ""
				+ ""
				+ "### Faza 1: ARD - ostra choroba retrowirusowa"
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ "### Faza 2: Okres bezobjawowy"
				+ ""
				+ "Okres bezobjawowy natomiast może trwać wiele lat, ale pod warunkiem, że przyjmuje się leki hamujące replikację wirusa. Mogą występować objawy resztkowe. Czas trwania okresu bezobjawowego zależy od ciężkości ARD, typu wirusa i momentu rozpoczęcia leczenia."
				+ ""
				+ ""
				+ ""
				+ "### Faza 3: AIDS"
				+ ""
				+ "AIDS jest ostatnią fazą zakażenia wirusem HIV, ale wmiędzyczasie mogą jeszcze występować: (1) przewlekła uogólniona limfadenopatia,oraz (2) pancytopenia."
				+ ""
				+ ""
				+ ""
				+ "## Objawy AIDS"
				+ ""
				+ "Objawy AIDS to przede wszytkim:"
				+ ""
				+ "1. Nocnepoty"
				+ "2. Egzema"
				+ ""
				+ "4. Wyniszczenie"
				+ "5. Limfadenopatie"
				+ "6. Encefalopatie"
				+ "7. Nowotwory"
				+ ""
				+ ""
				+ ""
				+ "### Choroby wskaźnikowe HIV"
				+ ""
				+ "#### Grzybice i parazytozy:"
				+ ""
				+ ""
				+ "2. Rozsianako cocidiomykoza"
				+ "3. Kryptokokoza"
				+ "4. Przewlekła (ponad miesiąc) kryptosporydioza"
				+ "5. Histoplazmoza rozsiana"
				+ "6. Toksoplazmoza OUN"
				+ "7. Strongyloides stercoralis?"
				+ ""
				+ ""
				+ ""
				+ "#### Wirusowe:"
				+ ""
				+ "1. Choroba cytomegalowirusowa"
				+ "2. Cytomegalowirusowe zapalenie siatkówki z utratą widzenia"
				+ "3. Przewlekła wrzodziejąca opryszczka zwykła"
				+ "4. Mięczak zakaźny"
				+ ""
				+ ""
				+ ""
				+ "#### Bakteryjne:"
				+ ""
				+ "1. Rozsiane zakażenie Mycobacterim avium complex, lub M. Kansaii"
				+ "2. Gruźlica pozapłucna lub rozsiana"
				+ "3. Zakażenia prątkami atypowymi"
				+ "4. Zapalenie płuc Pneumocystis jiroveci"
				+ "5. Nawracające bakteryjne lub atypowe zapalenia płuc"
				+ "6. Nawracająca posocznica Salmonella spp"
				+ ""
				+ ""
				+ ""
				+ "#### Nowotwory"
				+ ""
				+ "1. Inwazyjne nowotwory o podłożu HPV, jak np. Rak szyjki macicy"
				+ "2. Mięsak Kaposiego"
				+ "3. Chłoniak Burkitta"
				+ "4. Leukoplakia włochata"
				+ ""
				+ ""
				+ ""
				+ "## Diagnostyka laboratoryjna"
				+ ""
				+ "Diagnostyka laboratoryjna HIV jest złożona. Wykonuje siętesty serologiczne. ELISA IV generacji wykrywa jednocześnie przeciwciałaanty-HIV1, anty-HIV2 i antygen p24. Potwierdza się to WesternBlotem."
				+ ""
				+ "Dostępne są dwa rodzaje testów genetycznych: NAAT (qPCR,NASBA, TMA), oraz test bDNA (rozgałęziony DNA)."
				+ ""
				+ "Przebiegi ciężkość zakażenia monitoruje się poprzez pomiar cytometryczny liczbylimfocytów Th (CD4+), oraz ilościowy pomiar HIV RNA we krwi. Dorośli wykonująbadanie 2-4 razy w roku, a dzieci zawsze 4 razy w roku."
				+ ""
				+ "!/[Poziomy przeciwciał i antygenów w HIV](img/hiv-serum-levels.png)"
				+ ""
				+ ""
				+ ""
				+ "## Zasady terapii"
				+ ""
				+ "1. Największy problem: wirus bardzo szybko wytwarza oporność na leki."
				+ "2. Wytwarzanie oporności jest hamowane przez terapię łączoną = HAART(highly active anti-retroviral treatment). "
				+ "3. Celem leczenia jest zahamowanie replikacji HIV poniżej poziomu detekcji."
				+ ""
				+ ""
				+ ""
				+ "### Wskazania do terapii HAART"
				+ ""
				+ "Wskazaniem do rozpoczęcia leczenia HAART jest nie tylkorozpoznanie AIDS. Bez rozpoznania AIDS rozpoczynamy leczenie, gdy:"
				+ ""
				+ ""
				+ "2. Wykryto HIV-RNA we krwi"
				+ "3. Gdy u osoby zakażonej HIV stwierdzi się gruźlicę"
				+ "4. Gdy jest koinfekcja HIV/HBV lub HIV/HCV"
				+ "5. W nefropatii HIV"
				+ "6. W encefalopatii HIV"
				+ "7. W nowotworach oportunistycznych związanych z HIV"
				+ ""
				+ ""
				+ ""
				+ "## Leki"
				+ ""
				+ "Są 3 główne grupy leków"
				+ ""
				+ "- Nukleozydowe inhibitory RT (NRTI) - działają na HIV-1 i HIV-2"
				+ "- Nienukleozydowe inhibitory RT (NNRTI) - działają tylko na HIV-1"
				+ "- Inhibitory proteaz - działają tylko na HIV-1"
				+ ""
				+ "Dodatkowe grupy leków:"
				+ ""
				+ "- Antagoniści koreceptora CCR5**: Marwirok (po)"
				+ "- Inhibitory fuzyjne**: Enfuwirtyd (iv)"
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ "### **[NRTI](../../Farmakologia/Grupy/026 NRTI (nukleozydowe inhibitory odwrotnej transkryptazy).md)** (nukleozydowe inhibitory RT)"
				+ ""
				+ "1. Zywodudyna (=azydotymidyna) (iv, po)"
				+ "2. ~~Didanozyna (=dideoksyinozyna)~~"
				+ "3. ~~Zalcytabina (=dideoksycytydyna)~~"
				+ "4. ~~Stawudyna (d4T)~~"
				+ "5. Lamiwudyna (3TC) (po)"
				+ "6. Tenofowir (po)"
				+ "7. Adefowir (po)"
				+ "8. Abakawir (po)"
				+ ""
				+ ""
				+ ""
				+ "### **[NNRTI](../../Farmakologia/Grupy/027 NNRTI (nienukleozydowe inhibitory odwrotnej transkryptazy).md)** (nienukleozydowe inhibitory RT)"
				+ ""
				+ "1. Newirapina (po)"
				+ "2. ~~Delawiridyna~~"
				+ "3. Efawirenz (po)"
				+ ""
				+ ""
				+ ""
				+ "### **[Inhibitory proteaz](../../Farmakologia/Grupy/029 Inhibitory proteaz.md)**"
				+ ""
				+ "1. Sakwinawir (po)"
				+ "2. Rytonawir (po)"
				+ "3. Rytonawir+Lopinawir (po)"
				+ "4. Indynawir (po)"
				+ "5. ~~Nelfinawir~~"
				+ "6. Atazanawir (po)"
				+ "7. ~~Amprenawir~~"
				+ "8. Fosamprenawir (po)"
				+ ""
				+ ""
				+ ""
				+ "### [Inhibitory fuzji](../../Farmakologia/Grupy/029b Inhibitory fuzji.md): Enfuwirtyd (iv)"
				+ ""
				+ "### **[Antagoniści koreceptora CCR5](../Farmakologia/Grupy/029c Antagoniści koreceptora CCR5. md)**: Marwirok (po)"
				+ ""
				+ "### [Inhibitory integrazy](../../Farmakologia/Grupy/029d Inhibitory integrazy.md): Raltegrawir (po)"
				+ ""
				+ ""
				+ ""
				+ "### Zalecane kombinacje leków"
				+ ""
				+ "- Dwa nukleozydowe NRTI + jeden nienukleozydowy NNRTI"
				+ "- Dwa nukleozydowe NRTI + jeden inhibitor proteazy"
				+ ""
				+ "Najczęstsze połączenia, to:"
				+ ""
				+ ""
				+ "> - Didanozyna + stawudyna"
				+ "> - Stawudyna + lamiwudyna"
				+ ""
				+ ""
				+ ""
				+ "## Profilaktyka zakłuć"
				+ ""
				+ "Pracownicy medyczni są narażeni na zakażenie HIV pozakłuciu, ale ryzyko transmisji od pacjenta HIV+ wynosi 0,3-0,6%. Natomiast ryzyko zakażenia pacjenta przez pracownika medycznego jest bliskie zeru."
				+ ""
				+ "W przypadku zakłucia pracownika medycznego stosuje się następujący schemat:"
				+ ""
				+ "1. Nie wolno tamować krwawienia"
				+ "2. Rutynowo odkazić ranę"
				+ "3. Wykonać badania serologiczne"
				+ "4. Zastosować profilaktykę poekspozycyjną."
				+ ""
				+ "Postuluje się też zastosowanie profilaktyki przedekspozycyjnej, tj. Tenofovir+emtrycytabina u osób narażonych na zakażenie HIV."
				+ ""
				+ ""
				+ ""
				+ "## Uwagi"
				+ ""
				+ "- Może powodować zespół [mononukleozopodobny](../../Choroby i objawy/Infekcje ogólne/Mononukleoza zakaźna.md)"
				+ "";
		
		@Override
		public ImageReference[] galeria() {
			return new ImageReference[] { _Image("fazy-aids.png", "Fazy AIDS"),
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
					 * 
					 * 
					 */
					_Image("hiv-serum-levels.png", "Poziomy przeciwciał w HIV"),
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
					 * 
					 * 
					 * 
					 */
					
			};
		}


	}
}
