package pl.jblew.mm.ch.kardiologiczne.zapalenia;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.ChorobaAutoimmunologiczna;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.NadwrażliwośćTypu2ZależnaOdPrzeciwciał;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class GorączkaReumatyczna extends Choroba implements ChorobaAutoimmunologiczna {
	public static final GorączkaReumatyczna GorączkaReumatyczna = new GorączkaReumatyczna();

	protected GorączkaReumatyczna() {
		_constructor();
	}

	@Override
	public String definicja() {
		return NadwrażliwośćTypu2ZależnaOdPrzeciwciał.NadwrażliwośćTypu2ZależnaOdPrzeciwciał.definicja();
	}

	@Override
	public String docelowyAntygen() {
		return "Antygeny miokardium są podobne do antygenów ściany komórkowej paciorkowców";
	}

	@Override
	public String mechanizmNiszczenia() {
		return "Zapalenie, aktywacja makrofagów";
	}

	@Override
	public Stan[] przyczyny() {
		return array(new NadwrażliwośćTypu2ZależnaOdPrzeciwciał(docelowyAntygen(), mechanizmNiszczenia()));
	}

}
