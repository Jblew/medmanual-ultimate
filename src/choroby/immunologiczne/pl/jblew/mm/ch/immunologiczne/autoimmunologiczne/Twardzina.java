package pl.jblew.mm.ch.immunologiczne.autoimmunologiczne;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu4.NadwrażliwośćTypu4KomórekT;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class Twardzina extends Choroba {
	public static final Twardzina Twardzina = new Twardzina();

	protected Twardzina() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Choroba autoimmunologiczna charakteryzująca się nadmiernym włóknieniem w wielu narządach.";
	}

	public String mechanizmNiszczenia() {
		return "1. Uszkodzenie komórek śródbłonka przez nieznany czynnik powoduje jego pobudzenie i zwiększoną ekspresję"
				+ "cząsteczek przylegania oraz migrację aktywowanych komórek T do przestrzeni okołonaczyniowych\n"
				+ "2. Przeważającą frakcją są Th2, które produkują cytokiny: TGFβ, IL13, PDGF, i inne.\n "
				+ "3. Cytokiny od Th2 oraz makrofagów pobudzają fibroblasty do produkcji kolagenu\n"
				+ "4. Włóknienie powoduje zwęzanie małych naczyń --> niedokrwienie --> uszkodzenie śródbłonka --> więcej włóknienia";
	}

	@Override
	public Stan[] przyczyny() {
		return array(new NadwrażliwośćTypu4KomórekT("antygen nieznany. Nie wiadomo nawet, czy istnieje.",
				mechanizmNiszczenia()));
	}

}