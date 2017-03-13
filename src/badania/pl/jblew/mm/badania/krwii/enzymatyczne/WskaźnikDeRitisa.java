package pl.jblew.mm.badania.krwii.enzymatyczne;

import static pl.jblew.mm.dist.StaticUtils.array;
import static pl.jblew.mm.dist.StaticUtils.link;

import pl.jblew.mm.badania.Badanie;
import pl.jblew.mm.badania.ZasadaPobierania;
import pl.jblew.mm.badania.materiały.Materiał;
import pl.jblew.mm.ch.hepatologiczne.MarskośćWątroby;
import pl.jblew.mm.ch.hepatologiczne.PrzewlekłeUszkodzenieWątroby;
import pl.jblew.mm.ch.hepatologiczne.ToksyczneUszkodzenieWątroby;
import pl.jblew.mm.dist.StringThrowable;
import pl.jblew.mm.typy.Przyczyna;

public class WskaźnikDeRitisa extends Badanie {
	public String opis() {
		return "Jest to stosunek AST/ALT";
	}

	@Override
	public ZasadaPobierania[] zasadyPobierania() {
		throw new StringThrowable("Polega na wykonaniu pomiaru "
				+ link(AktywnośćAminotransferazyAsparaginianowej.AktywnośćAminotransferazyAsparaginianowej) + " i "
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
	public Przyczyna[] przyczynyHiper() {
		return array(
				przyczyna(ToksyczneUszkodzenieWątroby.ToksyczneUszkodzenieWątroby,
						"Gdy AST/ALT ~ 2 => alkoholowe uszkodzenie wątroby"),
				przyczyna(PrzewlekłeUszkodzenieWątroby.PrzewlekłeUszkodzenieWątroby, "AST/ALT < 1, czyli ALT > AST"),
				przyczyna(MarskośćWątroby.MarskośćWątroby, "AST/ALT < 1, czyli ALT > AST"));
	}

	@Override
	public Przyczyna[] przyczynyHypo() {
		return null;
	}

}
