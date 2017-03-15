package pl.jblew.mm.leki.antybiotyki.glikopeptydowe;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.leki.antybiotyki.Antybiotyk;

public class AntybiotykGlikopeptydowy extends Antybiotyk {
	public static final AntybiotykGlikopeptydowy AntybiotykGlikopeptydowy = new AntybiotykGlikopeptydowy();

	protected AntybiotykGlikopeptydowy() {
		_constructor();
	}

	public static class Wankomycyna extends AntybiotykGlikopeptydowy {
		public static final Wankomycyna Wankomycyna = new Wankomycyna();

		protected Wankomycyna() {
			_constructor();
		}
	}

	public static class Teikoplanina extends AntybiotykGlikopeptydowy {
		public static final Teikoplanina Teikoplanina = new Teikoplanina();

		protected Teikoplanina() {
			_constructor();
		}
	}

	public static class Daptomycyna extends AntybiotykGlikopeptydowy {
		public static final Daptomycyna Daptomycyna = new Daptomycyna();

		protected Daptomycyna() {
			_constructor();
		}
	}
}
