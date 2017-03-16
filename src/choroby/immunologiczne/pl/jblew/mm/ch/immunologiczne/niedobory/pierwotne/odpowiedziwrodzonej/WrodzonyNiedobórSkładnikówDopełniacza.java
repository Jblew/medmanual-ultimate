package pl.jblew.mm.ch.immunologiczne.niedobory.pierwotne.odpowiedziwrodzonej;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu3.NadwrażliwośćTypu3KompleksówImmunologicznych;
import pl.jblew.mm.typy.Skutek;
import pl.jblew.mm.typy.Stan;

public class WrodzonyNiedobórSkładnikówDopełniacza extends GenetycznyNiedobórSkładnikówOdpowiedziWrodzonej {
	public static final WrodzonyNiedobórSkładnikówDopełniacza WrodzonyNiedobórSkładnikówDopełniacza = new WrodzonyNiedobórSkładnikówDopełniacza();

	protected WrodzonyNiedobórSkładnikówDopełniacza() {
		_constructor();
	}

	public static class NiedobórC3 extends WrodzonyNiedobórSkładnikówDopełniacza {
		public static final NiedobórC3 NiedobórC3 = new NiedobórC3();

		protected NiedobórC3() {
			_constructor();
		}

		@Override
		public String definicja() {
			return "C3 jest kluczowy dla drogi klasycznej i alternatywnej. Jego niedobór powoduje zwiększoną"
					+ " wrażliwosć na zakażenia bakteriami ropotwórczymi";
		}

		@Override
		public Stan[] skutki() {
			return array(new Skutek("Zakażenia bakterimi ropotwórczymi"));
		}

	}

	public static class Niedobór_C1q_C2_C4 extends WrodzonyNiedobórSkładnikówDopełniacza {
		public static final Niedobór_C1q_C2_C4 Niedobór_C1q_C2_C4 = new Niedobór_C1q_C2_C4();

		protected Niedobór_C1q_C2_C4() {
			_constructor();
		}

		@Override
		public String definicja() {
			return "Nie owodują zwiększonej zapadalności na zakażenia, ale zwiększają ryzyko chorób"
					+ " wywołanych kompleksami immunologicznymi.";
		}

		@Override
		public Stan[] skutki() {
			return array(NadwrażliwośćTypu3KompleksówImmunologicznych.NadwrażliwośćTypu3KompleksówImmunologicznych);
		}
	}

	public static class NiedobórC5_do_C9 extends WrodzonyNiedobórSkładnikówDopełniacza {
		public static final NiedobórC5_do_C9 NiedobórC5_do_C9 = new NiedobórC5_do_C9();

		protected NiedobórC5_do_C9() {
			_constructor();
		}

		@Override
		public String definicja() {
			return "Niedobór późnych składowych klasycznej drogi aktywacji dopełniacza. Skutkiem są nawracające"
					+ "zakażenia Neisseria, ponieważ Neisseria ma cienką ścianę komórkową i przez to jest "
					+ "podatna na lizę przez kompleks atakujący błonę.";
		}

		@Override
		public Stan[] skutki() {
			return array(new Skutek("Zakażenia Neisseria"));
		}

	}

	public static class BrakInhibitoraC1 extends WrodzonyNiedobórSkładnikówDopełniacza {
		public static final BrakInhibitoraC1 BrakInhibitoraC1 = new BrakInhibitoraC1();

		protected BrakInhibitoraC1() {
			_constructor();
		}

		@Override
		public String definicja() {
			return "Powoduje nadmierną aktywację C1 i wytwarzanie mediatorów naczynioruchowych --> wroszony obrzęk naczynioruchowy.";
		}

		@Override
		public Stan[] skutki() {
			return array(new Skutek("Wrodzony obrzęk naczynioruchowy => powtarzające się epizody "
					+ "miejscowego obrzęku zajmującego skórę i/lub błony śluzowe."));
		}

	}
}
