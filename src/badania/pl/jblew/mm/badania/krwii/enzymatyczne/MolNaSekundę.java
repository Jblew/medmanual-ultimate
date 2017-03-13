package pl.jblew.mm.badania.krwii.enzymatyczne;

import pl.jblew.mm.typy.Jednostka;
import pl.jblew.mm.typy.jednostki.JednostkaSI;

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
