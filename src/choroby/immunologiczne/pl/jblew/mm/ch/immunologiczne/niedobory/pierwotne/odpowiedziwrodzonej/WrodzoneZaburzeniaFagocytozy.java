package pl.jblew.mm.ch.immunologiczne.niedobory.pierwotne.odpowiedziwrodzonej;

import static pl.jblew.mm.dist.StaticUtils._constructor;
import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.typy.Skutek;
import pl.jblew.mm.typy.Stan;

public class WrodzoneZaburzeniaFagocytozy extends GenetycznyNiedobórSkładnikówOdpowiedziWrodzonej {
	public static final WrodzoneZaburzeniaFagocytozy WrodzoneZaburzeniaFagocytozy = new WrodzoneZaburzeniaFagocytozy();

	protected WrodzoneZaburzeniaFagocytozy() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Grupa obejmująca wiele zaburzeń czynności fagocytów.";
	}

	public static class ZaburzeniaOksydazyFagocytów extends WrodzoneZaburzeniaFagocytozy {
		public static final ZaburzeniaOksydazyFagocytów ZaburzeniaOksydazyFagocytów = new ZaburzeniaOksydazyFagocytów();

		protected ZaburzeniaOksydazyFagocytów() {
			_constructor();
		}

		@Override
		public Stan[] skutki() {
			return array(new Skutek("Przewlekła choroba ziarniniakowa"));
		}

	}

	public static class ZaburzeniaIntegryn extends WrodzoneZaburzeniaFagocytozy {
		public static final ZaburzeniaIntegryn ZaburzeniaIntegryn = new ZaburzeniaIntegryn();

		protected ZaburzeniaIntegryn() {
			_constructor();
		}

		@Override
		public String definicja() {
			return "Integryny są ligandami dla selektyn. Zaburzenie to upośledza adhezję leukocytów.";
		}
	}
}
