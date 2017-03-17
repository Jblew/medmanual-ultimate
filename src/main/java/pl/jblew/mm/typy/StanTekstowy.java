package pl.jblew.mm.typy;

import pl.jblew.mm.generator.GeneratorSkip;

@GeneratorSkip
public class StanTekstowy extends Stan {
	private final String definicja;

	public StanTekstowy(String definicja) {
		super();
		this.definicja = definicja;
	}

	@Override
	public String definicja() {
		return definicja;
	}

	@Override
	public String toInlineString() {
		return definicja();
	}
}
