package pl.jblew.mm.ch.neurologiczne;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.ChorobaAutoimmunologiczna;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu4.NadwrażliwośćTypu4KomórekT;
import pl.jblew.mm.typy.Stan;

public class StwardnienieRozsiane extends ChorobaDemielinizacyjna implements ChorobaAutoimmunologiczna {
	public static final StwardnienieRozsiane StwardnienieRozsiane = new StwardnienieRozsiane();

	protected StwardnienieRozsiane() {
		_constructor();
	}

	@Override
	public String docelowyAntygen() {
		return "Białkowe antygeny w mielinie. Np. zasadowe białko mieliny.";
	}

	@Override
	public String mechanizm() {
		return "Zapalenie kontrolowane przez cytokiny z Th1 i Th17. Niszczenie mieliny przez aktywowane makrofagi.";
	}

	@Override
	public Stan[] maKomponenty() {
		return array(NadwrażliwośćTypu4KomórekT.NadwrażliwośćTypu4KomórekT);
	}

	@Override
	public Stan[] skutki() {
		return array(stan("Demielinizacja w OUN"), stan("Zapalenie wokół naczyń"), stan("Porażenie"),
				stan("Zmiany oczne"));
	}
}
