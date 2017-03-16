package pl.jblew.mm.wirusy.picornawirusy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class Rinowirus extends Picornawirus {
	public static final Rinowirus Rinowirus = new Rinowirus();

	protected Rinowirus() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "\n"
				+ "Rinowirusy mają aż 151 typów – dlatego nie jest praktycznie możliwe uodpornienie. Powodują przeziębienia. Odpowiadają za >50% wszystkich zakażeń górnych dróg oddechowych!\n"
				+ "\n"
				+ "Nie replikują w przewodzie pokarmowym, bo są labilne w kwaśnym pH. Słabo replikują powyżej 33*C. Natomiast świetnie sobie radzą w środowisku: są odporne na wysychanie i detergenty. Mają bardzo małą dawkę zakaźną: wystarczy jeden wirion (a w 1ml wydzieliny z nosa jest ponad 500).\n"
				+ "\n"
				+ "Drażnią błonę śluzową jamy nosowej → wydzielanie histaminy i bradykininy → wodnisty katar.\n"
				+ "\n"
				+ "Wrotami jest nie tylko układ oddechowy, ale u dzieci także spojówki.\n"
				+ "\n"
				+ "Katar rinowirusowy trwa 3-7 dni, ale może nawet do 14 dni. \n"
				+ "\n"
				+ "Po przebyciu zakażenia odporność humoralna utrzymuje sięzaledwie 1 tydzień w IgA, 18 miesięcy w IgG. A odpowiedź komórkowa tu nic niedaje.\n"
				+ "\n"
				+ "Powstaje nowatorski lek Pleconaril – rozpuszczalnecząsteczki ICAM-1 wiążące wirusa – jest już w II fazie badań klinicznych.Prawdopodobnie będzie dostępny jako profilaktyka zaostrzeń astmy.";
	}
}
