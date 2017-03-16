package pl.jblew.mm.wirusy.herpeswirusy.vzv;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.wirusy.herpeswirusy.Herpeswirus;

public class VZV extends Herpeswirus {
	public static final VZV VZV = new VZV();

	protected VZV() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Jest to wirus neurotropowy.VZV powoduje: ospę wietrzną, półpasiec i ospę wietrzną krwotoczną. Może także powodować zakażenie wrodzone i okołoporodowe.\n"
				+ "\n"
				+ "Powikłania ospy wietrznej:\n"
				+ "\n"
				+ "1. Zapaleniepłuc – 15%\n"
				+ "2. ZOMR\n"
				+ "3. Nadostrezapalenie mózgu z ataksją móżdżkową\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "Pierwotne zakażenia (i pierwotna wiriemia) są bezobjawowe.\n"
				+ "\n"
				+ "Po zakażeniu wirus namnaża się w węzłach chłonnych, potem następuje pierwotna wiriemia i wirus zaczyna się replikować uukładzie SS wątroby i śledziony. Po ok. 10 dniach od zakażenia dochodzi do wiriemii wtórnej, i już wtedy wirus jest wydalany. Natomiast wysypka i gorączka pojawiają się dopiero od 13-15 dnia. (Przez wcześniejsze 3-5 dni inni ludzie są zarażani).\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "## Szczepionka\n"
				+ "\n"
				+ "Jest stosowana szczepionka przeciwko VZV (ale nie jest w kalendarzu szczepień). Jest to szczepionka żywa, atenuowana – szczep Oka. Dwie dawki – 6 miesięczny interwał, powyżej 2rż.\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "## Leczenie\n"
				+ "\n"
				+ "[Leczenie zakażeń herpeswirusowych](./Herpeswirusy.md)\n"
				+ "\n"
				+ "[Zasady leczenia infekcji wirusowych](../../Choroby i objawy/Infekcje ogólne/Zasady leczenia infekcji wirusowych.md)";
	}

	@Override
	public String epidemiologia() {
		return "Najwięcej zakażeń jest zimą – styczeń. Jest przenoszony drogą kropelkową.";
	}

	@Override
	public ImageReference[] galeria() {
		return new ImageReference[] { new ImageReference("vzv-epidemiologia.png", "Częstość zakażeń VZV w roku"),
				/*
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 */
				new ImageReference("ospa-1.png", "Ospa wietrzna"),
				/*
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 */
				new ImageReference("ospa-2.png", "Ospa wietrzna"),
				/*
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 */
				new ImageReference("ospa-3.png", "Ospa wietrzna"),
				/*
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 */
				new ImageReference("polpasiec-1.png", "Półpasiec"),
				/*
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 */
				new ImageReference("polpasiec-2.png", "Półpasiec"),
				/*
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 */
		};
	}
}
