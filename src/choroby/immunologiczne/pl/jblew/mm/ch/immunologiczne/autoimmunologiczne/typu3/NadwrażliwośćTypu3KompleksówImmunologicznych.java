package pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu3;

import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.Nadwrażliwość;
import pl.jblew.mm.typy.Stan;

public final class NadwrażliwośćTypu3KompleksówImmunologicznych extends Nadwrażliwość {
	public static final NadwrażliwośćTypu3KompleksówImmunologicznych NadwrażliwośćTypu3KompleksówImmunologicznych = new NadwrażliwośćTypu3KompleksówImmunologicznych(
			null);
	private final Stan przyczyna;

	public NadwrażliwośćTypu3KompleksówImmunologicznych(Stan przyczyna) {
		super("ZależnyOdPrzyczyny", "Odkładanie kompleksów antygen-przeciwciało, co powoduje aktywację dopełniacza");
		this.przyczyna = przyczyna;
	}

	@Override
	public String definicja() {
		return "Kompleksy antygen-przeciwciało powstające w krążeniu "
				+ "odkładają się w ścianie naczyń i prowadzą do aktywacji dopełniacza, "
				+ "co skutkuje ostrym zapaleniem naczyń.";
	}

	@Override
	public String toInlineString() {
		return "NadwrażliwośćTypu3KompleksówImmunologicznych {z powodu: " + przyczyna.toInlineString() + "}";
	}

	@Override
	public Stan[] przyczyny() {
		return przyczyna != null ? array(przyczyna) : array();
	}

}
