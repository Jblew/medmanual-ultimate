package pl.jblew.mm.ch.metaboliczne.cukrzyca;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu4.NadwrażliwośćTypu4KomórekT;
import pl.jblew.mm.typy.Stan;

public class CukrzycaInsulinozależna extends Cukrzyca {
	public static final CukrzycaInsulinozależna CukrzycaInsulinozależna = new CukrzycaInsulinozależna();

	protected CukrzycaInsulinozależna() {
		_constructor();
	}

	public String docelowyAntygen() {
		return "Komórki T przeciw antygenom komórek beta wysp trzustkowych: "
				+ "insulinie, dekarboksylazie kwasu glutaminowego, innym.";
	}

	public String mechanizmNiszczenia() {
		return "Zapalenie wywołane przez komórki T, wyspy niszczone w mechanizmie CTL";
	}

	@Override
	public Stan[] przyczyny() {
		return array(new NadwrażliwośćTypu4KomórekT(docelowyAntygen(), mechanizmNiszczenia()));
	}

	@Override
	public Stan[] skutki() {
		return array(stan("Insulitis (przewlekłe zapalenie w obrębie wysp trzustkowych)"),
				stan("Zniszczenie komórek beta"), Cukrzyca);
	}
}
