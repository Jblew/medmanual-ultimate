package pl.jblew.mm.leki.antybiotyki.sulfonamidy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.leki.antybiotyki.Antybiotyk;

public class Sulfonamid extends Antybiotyk {
	public static final Sulfonamid Sulfonamid = new Sulfonamid();

	protected Sulfonamid() {
		_constructor();
	}

	public static class Sulfometoksazol extends Sulfonamid {
		public static final Sulfometoksazol Sulfometoksazol = new Sulfometoksazol();

		protected Sulfometoksazol() {
			_constructor();
		}
	}

	public static class Trimetoprim extends Sulfonamid {
		public static final Trimetoprim Trimetoprim = new Trimetoprim();

		protected Trimetoprim() {
			_constructor();
		}
	}

	public static class Kotrimoksazol extends Sulfonamid {
		public static final Kotrimoksazol Kotrimoksazol = new Kotrimoksazol();

		protected Kotrimoksazol() {
			_constructor();
		}
	}

	public static class Sulfakarbamid extends Sulfonamid {
		public static final Sulfakarbamid Sulfakarbamid = new Sulfakarbamid();

		protected Sulfakarbamid() {
			_constructor();
		}
	}

	public static class Sulfacetamid extends Sulfonamid {
		public static final Sulfacetamid Sulfacetamid = new Sulfacetamid();

		protected Sulfacetamid() {
			_constructor();
		}
	}

	public static class SoleSrebroweSulfadiazyny extends Sulfonamid {
		public static final SoleSrebroweSulfadiazyny SoleSrebroweSulfadiazyny = new SoleSrebroweSulfadiazyny();

		protected SoleSrebroweSulfadiazyny() {
			_constructor();
		}
	}
}
