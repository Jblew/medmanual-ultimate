package pl.jblew.mm.typy.jednostki;

import pl.jblew.mm.generator.GeneratorSkip;
import pl.jblew.mm.typy.Jednostka;

@GeneratorSkip
public class InnaJednostka extends Jednostka {
	public final String name;

	public InnaJednostka(String name) {
		super();
		this.name = name;
	}

	@Override
	public Jednostka[] coMożnaPrzeliczyć() {
		return null;
	}

	@Override
	public JednostkaSI naJednostkęSI() {
		return null;
	}

	@Override
	public double przelicz(double wartość, Jednostka na) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return name;
	}

}
