package pl.jblew.mm.wirusy.papillomawirusy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class HPV extends Papillomawirus {
	public static final HPV HPV = new HPV();

	protected HPV() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Ma potencjał onkogenny: jego białko E6 degraduje p53, a białko E7 – wiąże czynnik RB.\n"
				+ "\n"
				+ "HPV najchętniej zakaża komórki nabłonkowe w trzech lokalizacjach: (1) w skórze dłoni i stóp, (2) w nabłonku krtani i (3) w nabłonku szyjki macicy. Zakażenie powoduje powstanie brodawek (kurzajek). Brodawki zwykle same ustępują, mogą jednak sprzyjać transformacji nowotworowej.\n"
				+ "\n"
				+ "HPV jest bardzo szeroko rozpowszechnionym wirusem. Jest przenoszony przez kontakt bezpośredni, samozakażenie, kontakty seksualne. Może dochodzić do zakażenia okołoporodowego, co powoduje brodawczaka krtani u dzieci.\n"
				+ "\n"
				+ "HPV powoduje kłykciny kończyste narządów płciowych i odbytu,które mogą stać się nowotworem. 95% przypadków jest powodowanych przez HPV-6 iHPV-11. \n"
				+ "\n"
				+ "HPV sprzyja też rakowi szyjki macicy i rakowi sromu. HPV jest najczęstszą przyczyną raka szyjki macicy. Powoduje też brodawczaki –nowotwory. Występują brodawczaki krtani i spojówek.\n"
				+ "\n"
				+ "Komórki szyjki macicy można screeningować na obecność HPV wykonując tzw. „cytologię”, czyli barwiąc zeskrobiny metodą Papanicolau. Obecność koilocytów świadczy o zakażeniu komórek przez wirusa.\n"
				+ "### Szczepionka\n"
				+ "W Polsce jest dostępna biwalentna szczepionka – nie jest refundowana, ale jest wiele lokalnych programów finansujących szczepienie. Na świecie jest już dostępna szczepionka nonawalentna. W tej chwili grupą docelową szczepionki (wg rekomendacji WHO) są dziewczynki 9-13 lat. \n";

	}

	@Override
	public ImageReference[] galeria() {
		return new ImageReference[] { new ImageReference("koilocyty.png", "Koilocyty barwione metodą Papanicolau"),
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
				 */
				new ImageReference("brodawka.png", "Brodawka (Kurzajka)"),
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
		};
	}
}
