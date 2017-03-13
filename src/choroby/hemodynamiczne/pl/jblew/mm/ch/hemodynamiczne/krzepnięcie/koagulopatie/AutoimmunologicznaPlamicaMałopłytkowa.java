package pl.jblew.mm.ch.hemodynamiczne.krzepnięcie.koagulopatie;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.adnotacje.Comment;
import pl.jblew.mm.ch.hemodynamiczne.Krwotok;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.NadwrażliwośćTypu2ZależnaOdPrzeciwciał;
import pl.jblew.mm.typy.Stan;

public class AutoimmunologicznaPlamicaMałopłytkowa extends Plamica {
	public static final AutoimmunologicznaPlamicaMałopłytkowa AutoimmunologicznaPlamicaMałopłytkowa = new AutoimmunologicznaPlamicaMałopłytkowa();

	protected AutoimmunologicznaPlamicaMałopłytkowa() {
		_constructor();
	}

	@Override
	@Comment(text = "W podręczniku jest krwawienie. Czy krwawienie różni się od krwotoku?")
	public Stan[] skutki() {
		return array(Krwotok.Krwotok);
	}

	@Override
	public String definicja() {
		return NadwrażliwośćTypu2ZależnaOdPrzeciwciał.NadwrażliwośćTypu2ZależnaOdPrzeciwciał.definicja();
	}

	public String docelowyAntygen() {
		return "Białka błonowe płytek (integryny GpIIb/GpIIa)";
	}

	public String mechanizm() {
		return "Opłaszczanie i fagocytoza płytek";
	}

	@Override
	public Stan[] maKomponenty() {
		return array(NadwrażliwośćTypu2ZależnaOdPrzeciwciał.NadwrażliwośćTypu2ZależnaOdPrzeciwciał);
	}
}
