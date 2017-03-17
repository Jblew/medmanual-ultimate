package pl.jblew.mm.badania.krwi.enzymatyczne;

import pl.jblew.mm.adnotacje.Comment;
import pl.jblew.mm.generator.GeneratorSkip;
import pl.jblew.mm.typy.Jednostka;

@Comment(text = "Jest to liczba mikromoli substratu przetworzonych prze enzym w ciągu minuty. Zależy od metody badania!")
@GeneratorSkip
public class IU extends Jednostka {
	public static final IU I = new IU();

	private IU() {
	}

	@Override
	public Jednostka[] coMożnaPrzeliczyć() {
		return new Jednostka[] { MolNaSekundę.I };
	}

	@Override
	public MolNaSekundę naJednostkęSI() {
		return MolNaSekundę.I;
	}

	@Override
	public double przelicz(double wartość, Jednostka na) {
		return 0;
	}

	public BadanieAktywnościEnzymu[] enzymyDlaKtórychOpracowanoMetodyReferencyjne() {
		return new BadanieAktywnościEnzymu[] { AktywnośćDehydrogenazyMleczanowej.BadanieAktywnościEnzymu,
				AktywnośćAminotransferazyAsparaginianowej.AktywnośćAminotransferazyAsparaginianowej, /*     */
				AktywnośćAminotransferazyAlaninowej.AktywnośćAminotransferazyAlaninowej,
				AktywnosćKinazyKreatynowej.AktywnosćKinazyKreatynowej, /*     */
				AktywnośćGammaglutamylotransferazy.AktywnośćGammaglutamylotransferazy,
				AktywnośćFosfatazyAlkalicznej.AktywnośćFosfatazyAlkalicznej };
	}
}
