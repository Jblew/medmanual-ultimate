package pl.jblew.mm.wirusy.poxwirusy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class VARV extends Poxwirus {
	public static final VARV VARV = new VARV();

	protected VARV() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "= Variola Vera virus\n"
				+ "\n"
				+ "\n"
				+ "\n"
				+ "Wirus ospy prawdziwej wnika przez skórę lub błony śluzowe. Namnaża się we wrotach zakażenia powodując zmiany miejscowe. Następnie replikuje w węzłach chłonnych. Dochodzi do wiriemii i zakażenia ogólnego, któreczęsto powoduje śmierć.\n"
				+ "\n"
				+ "Wyróżnia się 3 rodzaje ospy prawdziwej: \n"
				+ "\n"
				+ "1. Variola minor –śmiertelność 1%,\n"
				+ "2. Variola major – śmiertelność 40%\n"
				+ "3. ospa krwotoczna (złośliwa) – śmiertelność 100%.\n"
				+ "\n"
				+ "Głównym objawem ospy prawdziwej była uogólniona pęcherzykowo-grudkowa wysypka.\n"
				+ "\n"
				+ "Ostatnie naturalne zachorowanie miało miejsce w 1977 w Somalii. Wirusy obecne w dwóch laboratoriach: Kolcowo w Rosji (koło Nowosybirska) i Atlanta w USA.\n"
				+ "\n"
				+ "U pacjentów z niedoborem odporności szczepionka może powodować nekrotyzujące zakażenie poszczepienne.\n";
	}

	@Override
	public ImageReference[] galeria() {
		return new ImageReference[] { _Image("variola-vera.png", "Ospa prawdziwa"),
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
				_Image("nekrotyzujace-zapalenie-po-szczepionce-na-varv.png",
						"Nekrotyzujące zapalenie poszczepienne - występuje u pacjentów z niedoborem odporności poddanym szczepieniu."),
				// Image nekrotyzujace-zapalenie-po-szczepionce-na-varv.png
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

		};
	}

}
