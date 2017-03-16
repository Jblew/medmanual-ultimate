package pl.jblew.mm.wirusy.picornawirusy.enterowirusy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class WirusPolio extends Enterowirus {
	public static final WirusPolio WirusPolio = new WirusPolio();

	protected WirusPolio() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Gatunki: Poliowirus 1, 2, 3\n"
				+ "\n"
				+ "Wirusy polio są przenoszone drogą fekalno-oralną, oddechową i kontaktową: zarówno kontakt bezpośredni, jak i pośredni.\n"
				+ "\n"
				+ "Wirus jest bardzo zakaźny – przy bliskim kontakcie 80% prawdopodobieństwa zarażenia. Może przetrwać do kilku tygodni w glebie i ściekach. Przez pierwsze 2-4 dni choroby jest wydalany drogą oddechową, a od 3 dni, do kilkunastu tygodni jest wydalany z kałem.\n"
				+ "\n"
				+ "Poliomyelitis – to nagminne porażenie dziecięce – nazywane też chorobą Heinego-Medina. Jest to zapalenie rogów przednich rdzenia kręgowego powodujące ostre porażenie wiotkie.\n"
				+ "\n"
				+ "90% zakażeń jest bezobjawowych.\n"
				+ "\n"
				+ "7% zakażeń powoduje zakażenie poronne, czyli chorobę minor (gorączka, wymioty, złe samopoczucie)\n"
				+ "\n"
				+ "2% zakażeń powoduje aseptyczne ZOMR\n"
				+ "\n"
				+ "1% → postać porażenna polio, czyli choroba major\n"
				+ "\n"
				+ "W postaci porażennej (choroba major) występuje asymetryczne porażenie mięśni kończyn lub tułowia z osłabieniem siły, bez utraty czucia, z osłabieniem odruchów. Wyróżnia się postaci: rdzeniową (poliowirus 1 – 80%przypadków), (2) postać opuszkową – porażenie nerwów opuszkowych – np. gardło, krtań, struny głosowe, (3) postać opuszkodo-rdzeniowa – 2% - porażenie mięśni oddechowych! (4) postać Laudrego – szybkie narastanie porażeń i zgon.\n"
				+ "\n"
				+ "Początkowe objawy polio są nieswoiste: gorączka, ból gardłai złe samopoczucie. Potem dołącza ostry ból głowy, sztywność karku i porażenie mięśni.\n"
				+ "\n"
				+ "W 30% postaci porażennej następuje remisja do 30dni, w 30% pozostaje lekkie porażenie – nogi Forresta Gumpa, w 30% porażenie ciężkie, a w 10% zaburzenia oddychania i zgon.\n"
				+ "\n"
				+ "Zarówno po przebyciu postaci porażennej, jak i po przejściu choroby minor można zachorować na zespół PPS (post-polio syndrome) – ok. 40% chorych rozwinie takie powikłania. Objawy PPS to uczucie zmęczenia, osłabienie i zanik mięśni, bóle mięśniowe, oraz nietolerancja niskiej temperatury.\n"
				+ "\n"
				+ "W tej chwili na świecie żyje ok. 20mln osób z PPS, z czego 1mln w Europie. \n"
				+ "\n"
				+ "Dostępne są dwie szczepionki na Polio. IPV – inaktywowana szczepionka Dr. Jonasa Salka, oraz OPV – żywa szczepionka dr Alberta Sabina. Szczepionka Sabina – OPV była pierwotnie szczepionką z wyboru. Szczepionka OPV ma tą wadę, że wydalany jest atenuowany, ale żywy wirus i skaża środowisko poprzez ścieki.\n"
				+ "\n"
				+ "W tej chwili w polskim kalendarzu szczepień znajduje sięszczepionka Salka – IPV. Stosuje się 4 dawki. Dawki pierwotne: 3-4mż, 5-6mż, dawkę uzupełniającą w 16-18mż, oraz dawkę przypominającą w 6rż (zmienione 2016)";
	}
}
