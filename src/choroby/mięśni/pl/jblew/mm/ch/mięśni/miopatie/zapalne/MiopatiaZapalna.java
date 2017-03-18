package pl.jblew.mm.ch.mięśni.miopatie.zapalne;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.Nadwrażliwość;
import pl.jblew.mm.ch.mięśni.UszkodzenieMięśniPoprzeczniePrążkowanych;
import pl.jblew.mm.ch.mięśni.miopatie.Miopatia;
import pl.jblew.mm.typy.Stan;

public class MiopatiaZapalna extends Miopatia {
	public static final MiopatiaZapalna MiopatiaZapalna = new MiopatiaZapalna();

	protected MiopatiaZapalna() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Grupa chorób autoimmunologicznych powodujących zapalenie i uszkodzenie mięśni";
	}

	@Override
	public Stan[] skutki() {
		return array(UszkodzenieMięśniPoprzeczniePrążkowanych.UszkodzenieMięśniPoprzeczniePrążkowanych);
	}

	@Override
	public Stan[] przyczyny() {
		return array(Nadwrażliwość.Nadwrażliwość);
	}

}