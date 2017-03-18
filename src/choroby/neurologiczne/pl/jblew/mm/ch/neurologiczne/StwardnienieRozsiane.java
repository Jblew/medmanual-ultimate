package pl.jblew.mm.ch.neurologiczne;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu4.NadwrażliwośćTypu4KomórekT;
import pl.jblew.mm.typy.Stan;

public class StwardnienieRozsiane extends ChorobaDemielinizacyjna {
	public static final StwardnienieRozsiane StwardnienieRozsiane = new StwardnienieRozsiane();

	protected StwardnienieRozsiane() {
		_constructor();
	}

	public String docelowyAntygen() {
		return "Białkowe antygeny w mielinie. Np. zasadowe białko mieliny.";
	}

	public String mechanizmNiszczenia() {
		return "Zapalenie kontrolowane przez cytokiny z Th1 i Th17. Niszczenie mieliny przez aktywowane makrofagi.";
	}

	@Override
	public Stan[] przyczyny() {
		return array(new NadwrażliwośćTypu4KomórekT(docelowyAntygen(), mechanizmNiszczenia()));
	}

	@Override
	public Stan[] skutki() {
		return array(stan("Demielinizacja w OUN"), stan("Zapalenie wokół naczyń"), stan("Porażenie"),
				stan("Zmiany oczne"));
	}
}
