package pl.jblew.mm.ch.krwi.krzepnięcia.nadkrzepliwość;

import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class MutacjaLeiden extends Choroba {
	public static final MutacjaLeiden MutacjaLeiden = new MutacjaLeiden();

	protected MutacjaLeiden() {
	}

	@Override
	public String definicja() {
		return "Zmiana sekwencji aminokwasów w genie czynnika V (krzepnięcia).";
	}

	@Override
	public Stan[] skutki() {
		return array(Nadkrzepliwość.Nadkrzepliwość);
	}

	@Override
	public String epidemiologia() {
		return "2-15% osób rasy białej";
	}

}