package pl.jblew.mm.badania;

import pl.jblew.mm.badania.materiały.Materiał;
import pl.jblew.mm.typy.Przyczyna;
import pl.jblew.mm.typy.Stan;

public abstract class Badanie {
	public abstract ZasadaPobierania[] zasadyPobierania();

	public abstract Materiał[] materiały();

	public abstract Przyczyna[] przyczynyHiper();

	public abstract Przyczyna[] przyczynyHypo();

	public final ZasadaPobierania zasada(String zasada) {
		return new TekstowaZasadaPobierania(zasada);
	}

	public final Przyczyna przyczyna(Stan stan) {
		return new Przyczyna(stan, "");
	}

	public final Przyczyna przyczyna(Stan stan, String wyjaśnienie) {
		return new Przyczyna(stan, wyjaśnienie);
	}
}
