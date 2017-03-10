package pl.jblew.mm.badania.krwii.enzymatyczne;

import pl.jblew.mm.adnotacje.Comment;
import pl.jblew.mm.typy.Jednostka;
import pl.jblew.mm.typy.JednostkaSI;

@Comment(text="Jest to liczba mikromoli substratu przetworzonych prze enzym w ciągu minuty. Zależy od metody badania!")
public class IU extends Jednostka {
	public static final IU I = new IU();
	private IU() {}
	
	@Override
	public Jednostka[] coMożnaPrzeliczyć() {
		return new Jednostka[]{MolNaSekundę.I};
	}
	@Override
	public MolNaSekundę naJednostkęSI() {
		return MolNaSekundę.I;
	}
	@Override
	public double przelicz(double wartość, Jednostka na) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public BadanieAktywnościEnzymu [] enzymyDlaKtórychOpracowanoMetodyReferencyjne() {
		return new BadanieAktywnościEnzymu [] {AktywnośćDehydrogenazyMleczanowej.I(),
				AktywnośćAminotransferazyAsparaginianowej.I(), AktywnośćAminotransferazyAlaninowej.I(),
				AktywnosćKinazyKreatynowej.I(), AktywnośćGammaglutamylotransferazy.I(), AktywnośćFosfatazyAlkalicznej.I()};
	}
}