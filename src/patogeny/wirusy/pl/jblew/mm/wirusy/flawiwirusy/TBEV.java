package pl.jblew.mm.wirusy.flawiwirusy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class TBEV extends Flawiwirus {
	public static final TBEV TBEV = new TBEV();

	protected TBEV() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Są 4 podtypy wirusów kleszczowego zapalenia mózgu: wirus wschodni, wirus zachodni, wirus turecki i wirus choroby skokowej. Są przenoszone przez inne kleszcze.\n"
				+ "\n"
				+ "Wirus zachodni jest przenoszony przez Ixodes Ricinus. Rezerwuar stanowią małe gryzonie.\n"
				+ "\n"
				+ "Wirus KZM jest bardzo wrażliwy – szybko traci zakaźność. Niszczy go wysuszenie, pasteryzacja, substancje chemiczne. Ale – może wiele miesięcy przetrwać w niepasteryzowanym mleku!\n"
				+ "\n"
				+ "Ludzie zakażają się nie tylko po ukąszeniu kleszcza, ale także po spożyciu mleka krowiego, koziego lub owczego niepasteryzowanego. Niema możliwości zakażenia bezpośrednio od człowieka,\n"
				+ "\n"
				+ "Wirus KZM może powodować:\n"
				+ "\n"
				+ "1. ZOMR\n"
				+ "2. ZOMR+encephalitis\n"
				+ "3. ZOMR+encephalitis+zapalenierdzenia\n"
				+ "4. -//- + zapalenie korzeni rdzeniowych";
	}
}
