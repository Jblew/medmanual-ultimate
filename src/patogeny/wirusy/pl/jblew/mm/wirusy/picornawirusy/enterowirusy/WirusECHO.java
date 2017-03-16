package pl.jblew.mm.wirusy.picornawirusy.enterowirusy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class WirusECHO extends Enterowirus {
	public static final WirusECHO WirusECHO = new WirusECHO();

	protected WirusECHO() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Nazwa ECHO to akronim od Enteric Cytopathogenic Human Orphan\n"
				+ "(ludzki jelitowy wirus sierocy). Powoduje wysypkę, choroby gorączkowe i\n"
				+ "biegunki.";
	}
}
