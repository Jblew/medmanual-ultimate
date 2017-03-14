package pl.jblew.mm.ch.hemodynamiczne;

import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.hemostatyczne.Zakrzepica;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class Zawał extends Choroba {
	public static final Zawał Zawał = new Zawał();

	protected Zawał() {
	}

	@Override
	public String definicja() {
		return "Obszar martwicy niedokrwiennej wywołanej zamknięciem krążenia"
				+ " naczyniowego zaopatrującego dany rejon";
	}

	@Override
	public Stan[] przyczyny() {
		return array(Zakrzepica.Zakrzepica, Zatorowość.Zatorowość);
	}

}