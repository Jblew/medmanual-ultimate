package pl.jblew.mm.badania.materiały;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.adnotacje.Image;

@Image(url = "../krwii/probowki.png") /*
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										
										*/
public class KrewŻylna extends Krew {
	public static final KrewŻylna KrewŻylna = new KrewŻylna();

	protected KrewŻylna() {
		_constructor();
	}

	public static class Pełna extends KrewŻylna {
		public static final KrewŻylna.Pełna Pełna = new Pełna();

		protected Pełna() {
			_constructor();
		}
	}

	public static class Osocze extends KrewŻylna {
		public static final KrewŻylna.Osocze Osocze = new Osocze();

		protected Osocze() {
			_constructor();
		}
	}

	public static class Surowica extends KrewŻylna {
		public static final KrewŻylna.Surowica Surowica = new Surowica();

		protected Surowica() {
			_constructor();
		}
	}

}
