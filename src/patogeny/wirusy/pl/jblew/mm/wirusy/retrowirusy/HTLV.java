package pl.jblew.mm.wirusy.retrowirusy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class HTLV extends Retrowirus {
	public static final HTLV HTLV = new HTLV();

	protected HTLV() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Przenoszone poprzez ślinę. Wirusy T-limfotropowy.\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "## HHV6\n"
				+ "\n"
				+ "- Zespół [mononukleozopodobny](../../Choroby i objawy/Infekcje ogólne/Mononukleoza zakaźna.md)\n"
				+ "- Rumień nagły\n"
				+ "- Gorączka bez wysypki\n"
				+ "- Jest wirusem onkogennym\n"
				+ "\n"
				+ "Zakażenia dotyczą najczęściej dzieci między 3mż-4rż. W większości są bezobjawowe, ale mogą przebiegać jako: **rumień nagły**, albo gorączka bez wysypki.\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "### Rumień nagły\n"
				+ "\n"
				+ "![Rumień nagły](img/rumien-nagly.png)\n"
				+ "\n"
				+ "↑ Rumień nagły\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "## Leczenie\n"
				+ "\n"
				+ "Nie sprawdzałem, czy jakikolwiek lek ma HHV6, lub HHV7 we wskazaniach.\n"
				+ "\n"
				+ "[Leczenie zakażeń herpeswirusowych](./Herpeswirusy.md)\n"
				+ "\n"
				+ "[Zasady leczenia infekcji wirusowych](../../Choroby i objawy/Infekcje ogólne/Zasady leczenia infekcji wirusowych.md)\n"
				+ "";
	}
}
