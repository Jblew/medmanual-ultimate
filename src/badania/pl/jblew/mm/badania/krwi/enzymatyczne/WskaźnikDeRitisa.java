package pl.jblew.mm.badania.krwi.enzymatyczne;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;
import static pl.jblew.mm.dist.StaticUtils.link;

import pl.jblew.mm.badania.Badanie;
import pl.jblew.mm.badania.ZasadaPobierania;
import pl.jblew.mm.badania.materiały.Materiał;
import pl.jblew.mm.ch.hepatologiczne.MarskośćWątroby;
import pl.jblew.mm.ch.hepatologiczne.PrzewlekłeUszkodzenieWątroby;
import pl.jblew.mm.ch.hepatologiczne.ToksyczneUszkodzenieWątroby;
import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.dist.StringThrowable;
import pl.jblew.mm.typy.Stan;

public class WskaźnikDeRitisa extends Badanie {
	public static final WskaźnikDeRitisa WskaźnikDeRitisa = new WskaźnikDeRitisa();

	protected WskaźnikDeRitisa() {
		_constructor();
	}

	public String opis() {
		return "Jest to stosunek AST/ALT";
	}

	@Override
	public ZasadaPobierania[] zasadyPobierania() {
		throw new StringThrowable("Polega na wykonaniu pomiaru "
				+ link(AktywnośćAminotransferazyAsparaginianowej.AktywnośćAminotransferazyAsparaginianowej)
				+ " i "
				+ link(AktywnośćAminotransferazyAlaninowej.AktywnośćAminotransferazyAlaninowej));
	}

	@Override
	public Materiał[] materiały() {
		return BadanieAktywnościEnzymu.BadanieAktywnościEnzymu.materiały();
	}

	public String wyjaśnienieWyniku() {
		return "Pozwala ocenić stopień (przyczynę?) uszkodzenia wątroby.";
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
			// TODO WskaźnikDeRitisa.Hiper.definicja
		}

		@Override
		public Stan[] przyczyny() {
			return array(
					stan(ToksyczneUszkodzenieWątroby.ToksyczneUszkodzenieWątroby,
							"Gdy AST/ALT ~ 2 => alkoholowe uszkodzenie wątroby"),
					stan(PrzewlekłeUszkodzenieWątroby.PrzewlekłeUszkodzenieWątroby, "AST/ALT < 1, czyli ALT > AST"),
					stan(MarskośćWątroby.MarskośćWątroby, "AST/ALT < 1, czyli ALT > AST"));
		}

	}

	public static class Hypo extends Stan {
		public static final Hypo Hypo = new Hypo();

		@Override
		public String definicja() {
			throw new NotImplementedYetException();
			// TODO WskaźnikDeRitisa.Hypo.definicja
		}

		@Override
		public Stan[] przyczyny() {
			return array();
		}

	}
}
