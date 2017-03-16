package pl.jblew.mm.wirusy.polyomawirusy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class BKV extends Polyomawirus {
	public static final BKV BKV = new BKV();

	protected BKV() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "U osób immunosupresyjnych: długotrwałe zakażenia nerek: śródmiąższowe zapalenie nerki, a także krwotoczne zapalenie pęcherza.";
	}
}
