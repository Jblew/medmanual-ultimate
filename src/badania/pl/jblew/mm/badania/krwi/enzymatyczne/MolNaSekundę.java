package pl.jblew.mm.badania.krwi.enzymatyczne;

import pl.jblew.mm.generator.GeneratorSkip;
import pl.jblew.mm.typy.Jednostka;
import pl.jblew.mm.typy.jednostki.JednostkaSI;

@GeneratorSkip
public class MolNaSekundę extends JednostkaSI {
	public static final MolNaSekundę I = new MolNaSekundę();

	private MolNaSekundę() {
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
		return 0;
	}

}
