package pl.jblew.mm.ch.metaboliczne.cukrzyca;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.adnotacje.Comment;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.NadwrażliwośćTypu2ZależnaOdPrzeciwciał;
import pl.jblew.mm.typy.Stan;

public class CukrzycaOpornaNaInsulinę extends Cukrzyca {
	public static final CukrzycaOpornaNaInsulinę CukrzycaOpornaNaInsulinę = new CukrzycaOpornaNaInsulinę();

	protected CukrzycaOpornaNaInsulinę() {
		_constructor();
	}

	@Override
	public String definicja() {
		return NadwrażliwośćTypu2ZależnaOdPrzeciwciał.NadwrażliwośćTypu2ZależnaOdPrzeciwciał.definicja();
	}

	@Comment(text = "Rzadki typ cukrzycy. W Cukrzycy typu 1 przeciwciała są przeciwko wyspom Langerhansa!")
	public String docelowyAntygen() {
		return "Receptor dla insuliny (anti-insulin receptor antibodies -AIRAs)";
	}

	public String mechanizmNiszczenia() {
		return "Przeciwciała hamują przyłączanie insuliny do receptora";
	}

	@Override
	public Stan[] przyczyny() {
		return array(new NadwrażliwośćTypu2ZależnaOdPrzeciwciał(docelowyAntygen(), mechanizmNiszczenia()));
	}
}