package pl.jblew.mm.badania;

import pl.jblew.mm.generator.GeneratorSkip;
import pl.jblew.mm.typy.Jednostka;
import pl.jblew.mm.typy.jednostki.InnaJednostka;

@GeneratorSkip
public class WartośćReferencyjna {
	public final String grupa;
	public final double min;
	public final double max;
	public final Jednostka jednostka;

	public WartośćReferencyjna(String grupa, double min, double max, Jednostka jednostka) {
		super();
		this.grupa = grupa;
		this.min = min;
		this.max = max;
		this.jednostka = jednostka;
	}

	public WartośćReferencyjna(String grupa, double min, double max, String jednostka) {
		super();
		this.grupa = grupa;
		this.min = min;
		this.max = max;
		this.jednostka = new InnaJednostka(jednostka);
	}
}
