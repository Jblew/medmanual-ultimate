package pl.jblew.mm.ch.krwi.krzepnięcia;

import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.adnotacje.Comment;
import pl.jblew.mm.ch.hemodynamiczne.Zastój;
import pl.jblew.mm.ch.krwi.krzepnięcia.nadkrzepliwość.Nadkrzepliwość;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class Zakrzepica extends Choroba {
	public static final Zakrzepica Zakrzepica = new Zakrzepica();

	protected Zakrzepica() {
	}

	@Override
	public String definicja() {
		return "Zwiększona skłonność do powstawania skrzepów wewnątrz łożyska naczyniowego";
	}

	@Override
	@Comment(text = "Triada Virchowa")
	public Stan[] przyczyny() {
		return array(Nadkrzepliwość.Nadkrzepliwość, /*        */
				UszkodzenieŚródbłonka.UszkodzenieŚródbłonka, /*        */
				Zastój.Zastój, /*                                      */
				TurbulentnyPrzepływKrwi.TurbulentnyPrzepływKrwi);
	}

}
