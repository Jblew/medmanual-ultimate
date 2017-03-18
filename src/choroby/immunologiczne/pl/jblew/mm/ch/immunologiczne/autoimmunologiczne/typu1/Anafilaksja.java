package pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu1;

import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.ogólnie.Choroba;
import pl.jblew.mm.typy.Stan;

public class Anafilaksja extends Choroba {
	public static final Anafilaksja Anafilaksja = new Anafilaksja();

	protected Anafilaksja() {
	}

	@Override
	public Stan[] przyczyny() {
		return array(new NadwrażliwośćTypu1Natychmiastowa("Reakcja na antygeny środowiskowe",
				"Uogólnione przemieszczanie płynu " + "do przestrzeni tkankowej: obrzęk i hipowolemia"));
	}

}
