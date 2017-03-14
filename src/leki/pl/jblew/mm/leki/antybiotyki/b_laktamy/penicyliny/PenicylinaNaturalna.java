package pl.jblew.mm.leki.antybiotyki.b_laktamy.penicyliny;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class PenicylinaNaturalna extends Penicylina {
	public static final PenicylinaNaturalna PenicylinaNaturalna = new PenicylinaNaturalna();

	protected PenicylinaNaturalna() {
		_constructor();
	}

	public static class PenicylinaG extends PenicylinaNaturalna {
		public static final PenicylinaG PenicylinaG = new PenicylinaG();

		protected PenicylinaG() {
			_constructor();
		}
	}

	public static class PenicylinaProkainowa extends PenicylinaNaturalna {
		public static final PenicylinaProkainowa PenicylinaProkainowa = new PenicylinaProkainowa();

		protected PenicylinaProkainowa() {
			_constructor();
		}
	}

	public static class PenicylinaBenzantynowa extends PenicylinaNaturalna {
		public static final PenicylinaBenzantynowa PenicylinaBenzantynowa = new PenicylinaBenzantynowa();

		protected PenicylinaBenzantynowa() {
			_constructor();
		}
	}

	public static class Fenoksymetylopenicylina extends PenicylinaNaturalna {
		public static final Fenoksymetylopenicylina Fenoksymetylopenicylina = new Fenoksymetylopenicylina();

		protected Fenoksymetylopenicylina() {
			_constructor();
		}
	}
}
