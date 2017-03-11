package pl.jblew.mm.badania.krwii.enzymatyczne;

import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.adnotacje.Image;
import pl.jblew.mm.badania.WartośćReferencyjna;
import pl.jblew.mm.ch.hepatologiczne.ToksyczneUszkodzenieWątroby;
import pl.jblew.mm.ch.hepatologiczne.zapalenia.WirusoweZapalenieWątroby;
import pl.jblew.mm.ch.mięśni.UszkodzenieMięśniPoprzeczniePrążkowanych;
import pl.jblew.mm.typy.Przyczyna;
import pl.jblew.mm.zabiegi.Hemodializa;

public class AktywnośćAminotransferazyAlaninowej extends BadanieAktywnościEnzymu {
	public static final AktywnośćAminotransferazyAlaninowej AktywnośćAminotransferazyAlaninowej = new AktywnośćAminotransferazyAlaninowej();

	protected AktywnośćAminotransferazyAlaninowej() {
	}

	@Override
	public RodzajEnzymu jakiRodzajEnzymu() {
		return RodzajEnzymu.WEWNĄTRZKOMÓRKOWY_CYTOPLAZMATYCZNY;
	}

	@Override
	public String lokalizacja() {
		return "Njwiększa aktywność w komórkach wątroby i komórkach ściany cewek nerkowych. "
				+ "Nieco mniejsza w mięśniach szkieletowych i mięśniu sercowym";
	}

	@Override
	public String budowaEnzymu() {
		return "";
	}

	@Override
	@Image(url = "alt.jpg") /*
							
							
							
							
							
							
							
							*/
	public String reakcja() {
		return "Przeniesienie grupy aminowej między alaniną, a α-ketoglutaranem";
	}

	@Override
	public WartośćReferencyjna[] wartościReferencyjne() {
		return array(new WartośćReferencyjna("Niemowlęta", 0, 60, IU.I),
				new WartośćReferencyjna("Kobiety", 9, 36, IU.I), new WartośćReferencyjna("Mężczyźni", 9, 43, IU.I));
	}

	@Override
	public Przyczyna[] przyczynyHiper() {
		return array(przyczyna(ToksyczneUszkodzenieWątroby.ToksyczneUszkodzenieWątroby),
				przyczyna(WirusoweZapalenieWątroby.WirusoweZapalenieWątroby, "Również bezobjawowe"),
				przyczyna(UszkodzenieMięśniPoprzeczniePrążkowanych.UszkodzenieMięśniPoprzeczniePrążkowanych));
	}

	@Override
	public Przyczyna[] przyczynyHypo() {
		return array(przyczyna(Hemodializa.Hemodializa, "Bo usuwa koenzym tej reakcji – fosforan pirydoksalu"));
	}

	@Image(url = "aminotransferases.png") /*
											
											
											
											
											
											
											
											
											
											
											
											*/
	public void reakcjeAminotransferaz() {
	}
}
