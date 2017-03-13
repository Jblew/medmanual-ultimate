package pl.jblew.mm.ch.hemodynamiczne;

import static pl.jblew.mm.dist.StaticUtils.array;
import static pl.jblew.mm.dist.StaticUtils.link;

import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class Zator extends Choroba {
	public static final Zator Zator = new Zator();

	protected Zator() {
	}

	@Override
	public String definicja() {
		return "Zator to niezwiązana ze ścianą naczynia stała, ciekła lub gazowa "
				+ "masa wewnątrznaczyniowa przemieszczana z prądem krwi " + "do miejsc odległych od miejsca powstania "
				+ "(a " + link(Zatorowość.Zatorowość) + " to zamknięcie/zwężenie tętnicy przez materiał zatorowy).";
	}

	@Override
	public Stan[] skutki() {
		return array(Zatorowość.Zatorowość);
	}

}
