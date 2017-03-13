package pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.hematologiczne.niedokrwistości.NiedokrwistośćHemolityczna;
import pl.jblew.mm.typy.Stan;

public class AutoimmunologicznaNiedokrwistośćHemolityczna extends NadwrażliwośćTypu2ZależnaOdPrzeciwciał {
	public static final AutoimmunologicznaNiedokrwistośćHemolityczna AutoimmunologicznaNiedokrwistośćHemolityczna = new AutoimmunologicznaNiedokrwistośćHemolityczna();

	protected AutoimmunologicznaNiedokrwistośćHemolityczna() {
		_constructor();
	}

	@Override
	public Stan[] skutki() {
		return array(NiedokrwistośćHemolityczna.NiedokrwistośćHemolityczna);
	}

}
