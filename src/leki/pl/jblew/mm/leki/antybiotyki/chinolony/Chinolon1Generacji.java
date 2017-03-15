package pl.jblew.mm.leki.antybiotyki.chinolony;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class Chinolon1Generacji extends Chinolon {
	public static final Chinolon1Generacji Chinolon1Generacji = new Chinolon1Generacji();

	protected Chinolon1Generacji() {
		_constructor();
	}

	public static class KwasNalidyksowy extends Chinolon1Generacji {
		public static final KwasNalidyksowy KwasNalidyksowy = new KwasNalidyksowy();

		protected KwasNalidyksowy() {
			_constructor();
		}
	}

	public static class KwasOksolinowy extends Chinolon1Generacji {
		public static final KwasOksolinowy KwasOksolinowy = new KwasOksolinowy();

		protected KwasOksolinowy() {
			_constructor();
		}
	}

	public static class Cinoksacyna extends Chinolon1Generacji {
		public static final Cinoksacyna Cinoksacyna = new Cinoksacyna();

		protected Cinoksacyna() {
			_constructor();
		}
	}

	public static class KwasPipemidowy extends Chinolon1Generacji {
		public static final KwasPipemidowy KwasPipemidowy = new KwasPipemidowy();

		protected KwasPipemidowy() {
			_constructor();
		}
	}
}
