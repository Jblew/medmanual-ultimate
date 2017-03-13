package pl.jblew.mm.ch.hemodynamiczne;

import static pl.jblew.mm.dist.StaticUtils.array;
import static pl.jblew.mm.dist.StaticUtils.link;

import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class Zatorowość extends Choroba {
	public static final Zatorowość Zatorowość = new Zatorowość();

	protected Zatorowość() {
	}

	@Override
	public String definicja() {
		return "Zamknięcie lub zwężenie tętnicy lub żyły przez materiał zatorowy mogący pochodzić z "
				+ link(Zator.Zator);
	}

	@Override
	public Stan[] przyczyny() {
		return array(Zator.Zator);
	}

}
