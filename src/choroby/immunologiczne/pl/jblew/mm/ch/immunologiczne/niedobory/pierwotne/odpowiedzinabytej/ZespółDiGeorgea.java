package pl.jblew.mm.ch.immunologiczne.niedobory.pierwotne.odpowiedzinabytej;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.grasica.HipoplazjaGrasicy;
import pl.jblew.mm.ch.immunologiczne.niedobory.pierwotne.PierwotnyNiedobórOdporności;
import pl.jblew.mm.typy.Stan;

public class ZespółDiGeorgea extends PierwotnyNiedobórOdporności {
	public static final ZespółDiGeorgea ZespółDiGeorgea = new ZespółDiGeorgea();

	protected ZespółDiGeorgea() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Genetycznie uwarunkowany niedorozwój grasicy prowadzący do niedoboru dojrzewania limfocytów T. "
				+ "Limfocyty T są nieobecne w węzłach, śledzionie i krwi obwodowej. Limfocyty B są nienaruszone.";
	}

	@Override
	public Stan[] przyczyny() {
		return array(HipoplazjaGrasicy.HipoplazjaGrasicy);
	}

}
