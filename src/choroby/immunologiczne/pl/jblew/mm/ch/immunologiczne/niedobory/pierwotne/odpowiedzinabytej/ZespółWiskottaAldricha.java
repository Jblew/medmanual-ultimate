package pl.jblew.mm.ch.immunologiczne.niedobory.pierwotne.odpowiedzinabytej;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.ch.immunologiczne.niedobory.pierwotne.PierwotnyNiedobórOdporności;

public class ZespółWiskottaAldricha extends PierwotnyNiedobórOdporności {
	public static final ZespółWiskottaAldricha ZespółWiskottaAldricha = new ZespółWiskottaAldricha();

	protected ZespółWiskottaAldricha() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Mutacja białka WASP, które łączy receptory z cytoszkieletem --> zależna od wieku utrata limfocytów T "
				+ "--> trombocytopenia+wypryski+podatność na nawracające zakażenia --> szybka śmierć.";
	}
}
