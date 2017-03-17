package pl.jblew.mm.badania.krwi.enzymatyczne;

import static pl.jblew.mm.dist.StaticUtils.S;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.adnotacje.Image;
import pl.jblew.mm.badania.WartośćReferencyjna;
import pl.jblew.mm.ch.hepatologiczne.ChorobaWątroby;
import pl.jblew.mm.ch.kardiologiczne.ZawałMięśniaSercowego;
import pl.jblew.mm.ch.krwi.niedokrwistości.NiedokrwistośćHemolityczna;
import pl.jblew.mm.ch.krwi.niedokrwistości.NiedokrwistośćMegaloblastyczna;
import pl.jblew.mm.ch.mięśni.ChorobaMięśniPoprzeczniePrążkowanych;
import pl.jblew.mm.ch.ogólnie.ChorobaNowotworowa;
import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.stany.fizjologiczne.Noworodek;
import pl.jblew.mm.typy.Stan;

public final class AktywnośćDehydrogenazyMleczanowej extends BadanieAktywnościEnzymu {
	public static final AktywnośćDehydrogenazyMleczanowej AktywnośćDehydrogenazyMleczanowej = new AktywnośćDehydrogenazyMleczanowej();

	private AktywnośćDehydrogenazyMleczanowej() {
	}

	@Override
	public RodzajEnzymu jakiRodzajEnzymu() {
		return RodzajEnzymu.WEWNĄTRZKOMÓRKOWY_CYTOPLAZMATYCZNY;
	}

	@Override
	@Image(url = "ldh.jpg") /*
							
							
							
							
							
							
							
							
							*/
	public String reakcja() {
		return "LDH katalizuje reakcję utleniania kwasu mlekowego i przekształcania do pirogronianu.";
	}

	@Override
	public String lokalizacja() {
		return "Wszystkie rodzaje komórek";
	}

	@Override
	public String budowaEnzymu() {
		return "Tetramer zbudowany z dwóch rodzajów podjednostek: M(muscle) i H(heart). Zobacz izoenzymy. ";
	}

	@Override
	public String izoenzymy() {
		return super.izoenzymy()
				+ S()
				+ "Zależnie od kombinacji podjednostek M i H w tetramerze rozwóżniamy 5 izoenzymów LDH. LDH1(HHHH) i LDH5(MMMM)"
				+ S()
				+ " - LDH1 (utlenia L-hydroksymaślan i jest nazywana dehydrogenazą hydroksymaślanową = HBDH)\n"
				+ " - LDH2 - dominuje w surowicy zdrowych osób. \n"
				+ " - LDH3 \n"
				+ " - LDH4 \n"
				+ " - LDH5 \n";
	}

	@Override
	public WartośćReferencyjna[] wartościReferencyjne() {
		return array(new WartośćReferencyjna("Noworodki do 5 dnia życia", 0, 1732, IU.I),
				new WartośćReferencyjna("Niemowlęta", 0, 1100, IU.I),
				new WartośćReferencyjna("Dzieci do 6rż", 0, 615, IU.I),
				new WartośćReferencyjna("Dorośli (bez rozróżnienia płci)", 0, 480, IU.I),
				new WartośćReferencyjna("Mężczyźni wg IFCC", 243, 253, IU.I),
				new WartośćReferencyjna("Kobiety wg IFCC", 244, 255, IU.I));
	}

	@Image(url = "cykl_corih.png") /*
									
									
									
									
									
									
									
									
									
									
									
									*/
	public void bierzeUdziałWCykluCorih() {
	}

	@Override
	public Stan[] stany() {
		return array(Hiper.Hiper, Hypo.Hypo);
	}

	public static class Hiper extends Stan {
		public static final Hiper Hiper = new Hiper();

		@Override
		public String definicja() {
			throw new NotImplementedYetException();
			// TODO enclosing_type.Hiper.definicja
		}

		@Override
		public Stan[] przyczyny() {
			return array(Noworodek.Noworodek, stan(ZawałMięśniaSercowego.ZawałMięśniaSercowego, "LDH1"),
					stan(NiedokrwistośćHemolityczna.NiedokrwistośćHemolityczna, "LDH1 i LDH2"),
					stan(NiedokrwistośćMegaloblastyczna.NiedokrwistośćMegaloblastyczna, "LDH1 i LDH2"),
					stan(ChorobaWątroby.ChorobaWątroby, "LDH4"),
					stan(ChorobaMięśniPoprzeczniePrążkowanych.ChorobaMięśniPoprzeczniePrążkowanych, "LDH5"),
					ChorobaNowotworowa.WszystkieNowotwory.WszystkieNowotwory);
		}

	}

	public static class Hypo extends Stan {
		public static final Hypo Hypo = new Hypo();

		@Override
		public String definicja() {
			throw new NotImplementedYetException();
			// TODO enclosing_type.Hypo.definicja
		}

		@Override
		public Stan[] przyczyny() {
			return array();
		}

	}
}
