package pl.jblew.mm.typy;

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

}
