package pl.jblew.mm.ch.krwi.niedokrwistości;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.ChorobaAutoimmunologiczna;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.NadwrażliwośćTypu2ZależnaOdPrzeciwciał;
import pl.jblew.mm.typy.Stan;

public class NiedokrwistośćZłośliwa extends Niedokrwistość implements ChorobaAutoimmunologiczna {
	public static final NiedokrwistośćZłośliwa NiedokrwistośćZłośliwa = new NiedokrwistośćZłośliwa();

	protected NiedokrwistośćZłośliwa() {
		_constructor();
	}

	@Override
	public String definicja() {
		return NadwrażliwośćTypu2ZależnaOdPrzeciwciał.NadwrażliwośćTypu2ZależnaOdPrzeciwciał.definicja();
	}

	@Override
	public String docelowyAntygen() {
		return "Czynnik wewnętrzny komórek okładzinowych żołądka";
	}

	@Override
	public String mechanizm() {
		return "Neutralizacja czynnika wewnętrznego --> zmniejszona absorpcja wit. B12 --> niedokrwistość megaloblastyczna";
	}

	@Override
	public Stan[] maKomponenty() {
		return array(NadwrażliwośćTypu2ZależnaOdPrzeciwciał.NadwrażliwośćTypu2ZależnaOdPrzeciwciał);
	}

	@Override
	public Stan[] skutki() {
		return array(NiedokrwistośćMegaloblastyczna.NiedokrwistośćMegaloblastyczna);
	}

}
