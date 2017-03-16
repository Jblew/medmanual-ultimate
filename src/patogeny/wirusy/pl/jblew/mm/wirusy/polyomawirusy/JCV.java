package pl.jblew.mm.wirusy.polyomawirusy;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class JCV extends Polyomawirus {
	public static final JCV JCV = new JCV();

	protected JCV() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "U osób immunosupresyjnych rozprzestrzenia się wewnątrz limfocytów B i zakaża komórki gleju prowadząc do zapalenia mózgu. I w efekcie PML – postępującej wieloogniskowej leukoencefalopatii.";
	}
}
