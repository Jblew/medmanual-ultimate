package pl.jblew.mm.badania.krwi.enzymatyczne;

import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.adnotacje.Image;
import pl.jblew.mm.badania.WartośćReferencyjna;
import pl.jblew.mm.ch.hepatologiczne.ToksyczneUszkodzenieWątroby;
import pl.jblew.mm.ch.hepatologiczne.zapalenia.WirusoweZapalenieWątroby;
import pl.jblew.mm.ch.mięśni.UszkodzenieMięśniPoprzeczniePrążkowanych;
import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.typy.Stan;
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
	@Image(url = "alt.jpg")
	/*
							
							
							
							
							
							
							
							*/
	public String reakcja() {
		return "Przeniesienie grupy aminowej między alaniną, a α-ketoglutaranem";
	}

	@Override
	public WartośćReferencyjna[] wartościReferencyjne() {
		return array(new WartośćReferencyjna("Niemowlęta", 0, 60, IU.I),
				new WartośćReferencyjna("Kobiety", 9, 36, IU.I), new WartośćReferencyjna("Mężczyźni", 9, 43, IU.I));
	}

	@Image(url = "aminotransferases.png")
	/*
												
												
	
												
												
	*/
	public void reakcjeAminotransferaz() {
	}

	@Override
	public Stan[] stany() {
		return array(Hiper.Hiper, Hypo.Hypo);
	}

	public static class Hiper extends Stan {
		public static final Hiper Hiper = new Hiper();

		@Override
		public String definicja() {
			throw new NotImplementedYetException();
			// TODO AktywnośćAminotransferazyAlaninowej.Hiper.definicja
		}

		@Override
		public Stan[] przyczyny() {
			return array(ToksyczneUszkodzenieWątroby.ToksyczneUszkodzenieWątroby,
					stan(WirusoweZapalenieWątroby.WirusoweZapalenieWątroby, "Również bezobjawowe"),
					UszkodzenieMięśniPoprzeczniePrążkowanych.UszkodzenieMięśniPoprzeczniePrążkowanych);
		}

	}

	public static class Hypo extends Stan {
		public static final Hypo Hypo = new Hypo();

		@Override
		public String definicja() {
			throw new NotImplementedYetException();
			// TODO AktywnośćAminotransferazyAlaninowej.Hypo.definicja
		}

		@Override
		public Stan[] przyczyny() {
			return array(stan(Hemodializa.Hemodializa, "Bo usuwa koenzym tej reakcji – fosforan pirydoksalu"));
		}

	}
}
