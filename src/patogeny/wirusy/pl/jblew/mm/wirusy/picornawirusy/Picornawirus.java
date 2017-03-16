package pl.jblew.mm.wirusy.picornawirusy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.wirusy.Wirus;

public class Picornawirus extends Wirus {
	public static final Picornawirus Picornawirus = new Picornawirus();

	protected Picornawirus() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "ssRNA+, nagi kapsyd, są hydrofilne. Bardzo małe: 20-30nm. "
				+ "Rodzaje patogenne dla ludzi: Enterowirusy, Hepatowirusy, Rinowirusy";
	}
}
