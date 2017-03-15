package pl.jblew.mm.badania.krwii.enzymatyczne;

import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.adnotacje.Image;
import pl.jblew.mm.badania.WartośćReferencyjna;
import pl.jblew.mm.ch.hepatologiczne.ToksyczneUszkodzenieWątroby;
import pl.jblew.mm.ch.hepatologiczne.drogiżółciowe.Cholestaza;
import pl.jblew.mm.ch.hepatologiczne.zapalenia.ZapalenieWątroby;
import pl.jblew.mm.ch.kardiologiczne.ZawałMięśniaSercowego;
import pl.jblew.mm.ch.krwi.niedokrwistości.NiedokrwistośćHemolityczna;
import pl.jblew.mm.ch.mięśni.UszkodzenieMięśniPoprzeczniePrążkowanych;
import pl.jblew.mm.ch.nefrologiczne.OstraNiewydolnośćNerek;
import pl.jblew.mm.ch.ppokarmowego.naczyniowe.ZastójWKrążeniuWrotnym;
import pl.jblew.mm.ch.zakaźne.MononukleozaZakaźna;
import pl.jblew.mm.typy.Przyczyna;
import pl.jblew.mm.zabiegi.Hemodializa;

public class AktywnośćAminotransferazyAsparaginianowej extends BadanieAktywnościEnzymu {
	public static final AktywnośćAminotransferazyAsparaginianowej AktywnośćAminotransferazyAsparaginianowej = new AktywnośćAminotransferazyAsparaginianowej();

	protected AktywnośćAminotransferazyAsparaginianowej() {
	}

	@Override
	public RodzajEnzymu jakiRodzajEnzymu() {
		return RodzajEnzymu.WEWNĄTRZKOMÓRKOWY_CYTOPLAZMATYCZNY;
	}

	@Override
	public String lokalizacja() {
		return "Najwyższa aktywnosć w mięśniu sercowym, wątrobie i mieśniach szkieletowych.";
	}

	@Override
	public String budowaEnzymu() {
		return "";
	}

	@Override
	@Image(url = "ast.jpg") /*
							
							
							
							
							
							
							
							*/
	public String reakcja() {
		return "Przeniesienie grupy aminowej między kw. asparaginianowym, a a-ketoglutarowym.";
	}

	@Override
	public WartośćReferencyjna[] wartościReferencyjne() {
		return array(new WartośćReferencyjna("Noworodki do 5dż", 0, 97, IU.I),
				new WartośćReferencyjna("Niemowlęta", 0, 82, IU.I), /*  */
				new WartośćReferencyjna("Kobiety", 10, 31, IU.I), /*  */
				new WartośćReferencyjna("Mężczyźni", 10, 34, IU.I));
	}

	@Override
	public Przyczyna[] przyczynyHiper() {
		return array(przyczyna(ToksyczneUszkodzenieWątroby.ToksyczneUszkodzenieWątroby),
				przyczyna(ZawałMięśniaSercowego.ZawałMięśniaSercowego),
				przyczyna(ZapalenieWątroby.ZapalenieWątroby, "ostre"),
				przyczyna(UszkodzenieMięśniPoprzeczniePrążkowanych.UszkodzenieMięśniPoprzeczniePrążkowanych,
						"zespół zmiażdżenia"),
				przyczyna(Cholestaza.Cholestaza),
				/*           */przyczyna(ZastójWKrążeniuWrotnym.ZastójWKrążeniuWrotnym),
				przyczyna(OstraNiewydolnośćNerek.OstraNiewydolnośćNerek),
				przyczyna(NiedokrwistośćHemolityczna.NiedokrwistośćHemolityczna),
				przyczyna(MononukleozaZakaźna.MononukleozaZakaźna));
	}

	@Override
	public Przyczyna[] przyczynyHypo() {
		return array(przyczyna(Hemodializa.Hemodializa));
	}

	@Image(url = "aminotransferases.png") /*
											
											
											
											
											
											
											
											
											
											
											
											*/
	public void reakcjeAminotransferaz() {
	}
}
