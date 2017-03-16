package pl.jblew.mm.wirusy.herpeswirusy.hsv;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.wirusy.herpeswirusy.Herpeswirus;

public class HSV extends Herpeswirus {
	public static final HSV HSV = new HSV();

	protected HSV() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "HSV1 i HSV2. HSV1 jest przenoszony drogą kontaktu bezpośredniego, a HSV2 przez kontakty płciowe.\n"
				+ "\n"
				+ "HSV1 to wirus neurotropowy. Ulega on latencji w komórkach zwojów nerwowych. Posiada białko ICP0, "
				+ "które jest przełącznikiem między scenariuszem latentnymi i replikatywnym. \n"
				+ "\n"
				+ "W infekcji latentnej limfocyty T naciekają neurony zakażoneprzez HSV1. Wirus ciągle stymuluje "
				+ "komórki CD8, ale jest to słaba stymulacja. Wystarczająca, aby utrzymywać CD8 w ciągłej synapsie "
				+ "immunologicznej, ale zbytsłaba, aby doszło do efekty cytotoksycznego.\n"
				+ "\n"
				+ "Wirusy HSV powodują różne rodzaje zakażeń zależnie, czy sąto zakażenia pierwotne, czy wynikające z "
				+ "reaktywacji.\n"
				+ "\n"
				+ "Zakażenia pierwotne HSV1/HSV2 miejscowe:\n"
				+ "\n"
				+ "1. Gingivomastititiset pharyngitis herpetica (opryszczkowe zapalenie jamy ustnej, dziąseł i gardła)\n"
				+ "2. Herpesgenitalis (pierwotna opryszczka narządów płciowych)\n"
				+ "3. Keratoconjunctivitisherpetica (herpeswirusowe zapalenie spojówek i rogówki)\n"
				+ "4. Zakażeniaskóry i zanokcica\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "Zakażenia wtórne skór i błon śluzowych:\n"
				+ "\n"
				+ "1. Herpes simplex=recurrens (opryszczkazwykła)\n"
				+ "2. Opryszczkapourazowa\n"
				+ "3. Nawrotowezapalenie jamy ustnej i dziąseł\n"
				+ "4. Nawrotowaopryszczka narządów płciowych.\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "Rozsiane i uogólnione zakażenia wywołane przez HSV:\n"
				+ "\n"
				+ "1. Eczemaherpeticum – wyprysk opryszczkowy\n"
				+ "2. Herpesneonatorum – opryszczka noworodków\n"
				+ "3. Zakażeniawrodzone\n"
				+ "4. Zakażeniau osób z upośledzoną odpornością\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "Wirusy HSV mogą też wywoływać zakażenia narządowe, takie jakzapalenie mózgu, ZOMR, zapalenia płuc i"
				+ " oskrzeli, zapalenie przełyku, wątroby,węzłów chłonnych, dróg moczowych oraz nerek.\n";

	}

	@Override
	public ImageReference[] galeria() {
		return new ImageReference[] {
				new ImageReference("opryszczkowe-zapalenie-jamy-ustnej.png", "Opryszczkowe zapalenie jamy ustnej"),
				/*
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 */
				new ImageReference("hsv-zakazenie-pierwotne-1.png", "Zakażenie pierwotne HSV"),
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
				new ImageReference("zanokcica-herpeswirusowa.png", "Zanokcica herpeswirusowa"),
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
				new ImageReference("herpes-gladiatorum.png", "Herpes gladiatorum"),
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
				new ImageReference("keratoconjunctivitis-herpetica.png", "Keratoconjunctivitis herpetica"),
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
				new ImageReference("herpes-simplex.png", "Herpes simplex (czyli reaktywacja zak. latentnego)"),
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
				new ImageReference("herpes-simplex-2.png", "Herpes simplex (czyli reaktywacja zak. latentnego)"),
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
				 */
				new ImageReference("herpes-gingivomastititis.png", "Gingivomastititis et pharyngitis herpetica"),
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
				new ImageReference("eczema-herpeticum.png", "eczema herpeticum"),
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
				new ImageReference("herpes-immunosupresja.png",
						"Rozsiana forma pierwotnego zakażenia HSV1 u osób z immunosupresją"),
				/*
				 * Image "herpes-immunosupresja.png"
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
				new ImageReference("herpeswirusowe-zapalenie-przelyku.png", "Zapalenie przełyku herpeswirusowe"),
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
		};
	}

}
