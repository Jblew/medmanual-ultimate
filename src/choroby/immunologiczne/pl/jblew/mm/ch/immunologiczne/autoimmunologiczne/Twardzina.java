package pl.jblew.mm.ch.immunologiczne.autoimmunologiczne;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.ChorobaAutoimmunologiczna;
import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu4.NadwrażliwośćTypu4KomórekT;
import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.dist.PrzyczynaNieznanaException;
import pl.jblew.mm.typy.Stan;

public class Twardzina extends Choroba implements ChorobaAutoimmunologiczna {
	public static final Twardzina Twardzina = new Twardzina();

	protected Twardzina() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Choroba autoimmunologiczna charakteryzująca się nadmiernym włóknieniem w wielu narządach.";
	}

	@Override
	public String docelowyAntygen() {
		return "Nieznany. Nie wiadomo nawet, czy istnieje.";
	}

	@Override
	public String mechanizm() {
		return "1. Uszkodzenie komórek śródbłonka przez nieznany czynnik powoduje jego pobudzenie i zwiększoną ekspresję"
				+ "cząsteczek przylegania oraz migrację aktywowanych komórek T do przestrzeni okołonaczyniowych\n"
				+ "2. Przeważającą frakcją są Th2, które produkują cytokiny: TGFβ, IL13, PDGF, i inne.\n "
				+ "3. Cytokiny od Th2 oraz makrofagów pobudzają fibroblasty do produkcji kolagenu\n"
				+ "4. Włóknienie powoduje zwęzanie małych naczyń --> niedokrwienie --> uszkodzenie śródbłonka --> więcej włóknienia";
	}

	@Override
	public Stan[] maKomponenty() {
		return array(NadwrażliwośćTypu4KomórekT.NadwrażliwośćTypu4KomórekT);
	}

	@Override
	public Stan[] przyczyny() {
		throw new PrzyczynaNieznanaException();
	}

}