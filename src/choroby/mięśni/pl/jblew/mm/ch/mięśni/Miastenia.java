package pl.jblew.mm.ch.mięśni;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.ChorobaAutoimmunologiczna;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.NadwrażliwośćTypu2ZależnaOdPrzeciwciał;
import pl.jblew.mm.typy.Stan;

public class Miastenia extends ChorobaMięśniPoprzeczniePrążkowanych implements ChorobaAutoimmunologiczna {
	public static final Miastenia Miastenia = new Miastenia();

	protected Miastenia() {
		_constructor();
	}

	@Override
	public String definicja() {
		return NadwrażliwośćTypu2ZależnaOdPrzeciwciał.NadwrażliwośćTypu2ZależnaOdPrzeciwciał.definicja();
	}

	@Override
	public String docelowyAntygen() {
		return "Receptor dla acetylocholiny";
	}

	@Override
	public String mechanizmNiszczenia() {
		return "Przeciwciała kompetycyjnie blokują receptor";
	}

	@Override
	public Stan[] przyczyny() {
		return array(new NadwrażliwośćTypu2ZależnaOdPrzeciwciał(docelowyAntygen(), mechanizmNiszczenia()));
	}
}
