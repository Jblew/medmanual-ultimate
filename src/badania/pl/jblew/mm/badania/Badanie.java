package pl.jblew.mm.badania;

import pl.jblew.mm.badania.materiały.Materiał;

public abstract class Badanie {
	public abstract ZasadaPobierania [] zasadyPobierania();
	public abstract Materiał [] materiały();
	
	public final ZasadaPobierania zasada(String zasada) {
		return new TekstowaZasadaPobierania(zasada);
	}
}
