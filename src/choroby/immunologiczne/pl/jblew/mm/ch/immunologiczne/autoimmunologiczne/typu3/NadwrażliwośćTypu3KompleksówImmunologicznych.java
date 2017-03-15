package pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu3;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.Nadwrażliwość;

public class NadwrażliwośćTypu3KompleksówImmunologicznych extends Nadwrażliwość {
	public static final NadwrażliwośćTypu3KompleksówImmunologicznych NadwrażliwośćTypu3KompleksówImmunologicznych = new NadwrażliwośćTypu3KompleksówImmunologicznych();

	protected NadwrażliwośćTypu3KompleksówImmunologicznych() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Kompleksy antygen-przeciwciało powstające w krążeniu "
				+ "odkładają się w ścianie naczyń i prowadzą do aktywacji dopełniacza, "
				+ "co skutkuje ostrym zapaleniem naczyń.";
	}
}
