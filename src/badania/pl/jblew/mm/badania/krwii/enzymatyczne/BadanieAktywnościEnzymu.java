package pl.jblew.mm.badania.krwii.enzymatyczne;

import static pl.jblew.mm.dist.StaticUtils.*;

import pl.jblew.mm.adnotacje.Comment;
import pl.jblew.mm.adnotacje.StringDescription;
import pl.jblew.mm.badania.Badanie;
import pl.jblew.mm.badania.ZasadaPobierania;
import pl.jblew.mm.badania.krwii.BadanieKrwii;
import pl.jblew.mm.badania.krwii.RodzajProbówki;
import pl.jblew.mm.badania.materiały.KrewŻylna;
import pl.jblew.mm.badania.materiały.Materiał;

public abstract class BadanieAktywnościEnzymu extends BadanieKrwii {
	public abstract RodzajEnzymu jakiRodzajEnzymu();
	
	public static enum RodzajEnzymu {
		
		@Comment(text="Są wykrywane tylko po uszkodzeniu komórki. Są różnie zlokalizowane (cytoplazma,mitochondrium,lizosomy, jądro),"
				+ " więc są wskaźnikami stopnia uszkodzenia komórki")
		WEWNĄTRZKOMÓRKOWY_NIEZDEFINIOWANY,
		WEWNĄTRZKOMÓRKOWY_ER, //GGTP, 5'-NT
		WEWNĄTRZKOMÓRKOWY_LIZOSOMALNY, //Fosfataza kwaśna
		WEWNĄTRZKOMÓRKOWY_CYTOPLAZMATYCZNY, //Fosfataza zasadowa, aminotransferaza asparaginowa, aminotransferaza alaninowa, kinaza kreatynowa
		
		@Comment(text="Wydzielane bezpośrednio do krwi. Obniżenie aktywności wskazuje na niewydolność narządu, który je produkuje")
		ZEWNĄTRZKOMÓRKOWY_SEKRECYJNY,
		
		@Comment(text="Wydzielane do płynów ustrojowych (jak ślina, przewód pokarmowy). Zwiększenie aktywności"
				+ " wskazuje na uszkodzenie struktury gruczołu lub zaburzenie procesu uwalniania enzymu.")
		ZEWNĄTRZKOMÓRKOWY_EKSKRECYJNY
	}
	
	@StringDescription
	public String izoenzymy() {
		return "Enzymy katalizujące tą samą reakcję, ale kodowane przez różne geny i wytwarzane przez różne komórki";
	}
	
	@StringDescription
	public String izoformy() {
		return "Enzymy katalizujące tą samą reakcję, kodowane przez te same geny, ale poddawane różnym modyfikacjom posttranslacyjnym";
	}

	@Override
	public ZasadaPobierania[] zasadyPobierania() {
		return array(
				zasada("Krew pobierana na skrzep lub do probówki z heparyną"),
				zasada("Krew pobierana na czczo"),
				zasada("Najkrótszy możliwy ucisk stazy"),
				zasada("Po oddzieleniu surowicy od skrzepu próbka może czekać 4h w temp. pokojowej lub 24h w temp. 4*C"),
				zasada("Należy bezwzględnie unikać hemolizy w próbce, bo erytrocyty zawierają wiele z badanych enzymów"),
				zasada("Zanotować jakie leki i ksenobiontyki pacjent przyjmował")
				);
	}

	@Override
	public RodzajProbówki[] rodzajeProbówki() {
		return new RodzajProbówki[] {RodzajProbówki.Z_HEPARYNĄ};
	}

	@Override
	public Materiał[] materiały() {
		return new Materiał [] {KrewŻylna.Osocze.I(), KrewŻylna.Pełna.I()};
	}
	
	
}
