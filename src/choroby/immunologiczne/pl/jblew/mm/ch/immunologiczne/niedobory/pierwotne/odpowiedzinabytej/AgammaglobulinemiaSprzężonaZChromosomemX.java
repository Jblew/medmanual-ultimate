package pl.jblew.mm.ch.immunologiczne.niedobory.pierwotne.odpowiedzinabytej;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.niedobory.pierwotne.PierwotnyNiedobórOdporności;
import pl.jblew.mm.typy.Stan;

public class AgammaglobulinemiaSprzężonaZChromosomemX extends PierwotnyNiedobórOdporności {
	public static final AgammaglobulinemiaSprzężonaZChromosomemX AgammaglobulinemiaSprzężonaZChromosomemX = new AgammaglobulinemiaSprzężonaZChromosomemX();

	protected AgammaglobulinemiaSprzężonaZChromosomemX() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Niemożność różnicowania komórek pre-B w komórki B. W konsekwencji we krwi nie występują immunoglobuliny";
	}

	@Override
	public Stan[] skutki() {
		return array(NiedobórOdporności);
	}

}
