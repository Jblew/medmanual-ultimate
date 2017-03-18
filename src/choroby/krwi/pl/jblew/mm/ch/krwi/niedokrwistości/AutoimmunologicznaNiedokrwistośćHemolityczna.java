package pl.jblew.mm.ch.krwi.niedokrwistości;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.NadwrażliwośćTypu2ZależnaOdPrzeciwciał;
import pl.jblew.mm.typy.Stan;

public class AutoimmunologicznaNiedokrwistośćHemolityczna extends NiedokrwistośćHemolityczna {
	public static final AutoimmunologicznaNiedokrwistośćHemolityczna AutoimmunologicznaNiedokrwistośćHemolityczna = new AutoimmunologicznaNiedokrwistośćHemolityczna();

	protected AutoimmunologicznaNiedokrwistośćHemolityczna() {
		_constructor();
	}

	@Override
	public Stan[] skutki() {
		return array(NiedokrwistośćHemolityczna);
	}

	@Override
	public String definicja() {
		return NadwrażliwośćTypu2ZależnaOdPrzeciwciał.NadwrażliwośćTypu2ZależnaOdPrzeciwciał.definicja();
	}

	public String docelowyAntygen() {
		return "Białka błony komórkowej erytrocytów (głównie antygeny Rh, antygen I)";
	}

	public String mechanizmNiszczenia() {
		return "Opłaszczanie i fagocytoza erytrocytów";
	}

	@Override
	public Stan[] przyczyny() {
		return array(new NadwrażliwośćTypu2ZależnaOdPrzeciwciał(docelowyAntygen(), mechanizmNiszczenia()));
	}

}
