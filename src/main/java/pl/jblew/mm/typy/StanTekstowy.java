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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((definicja == null) ? 0 : definicja.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StanTekstowy other = (StanTekstowy) obj;
		if (definicja == null) {
			if (other.definicja != null)
				return false;
		} else if (!definicja.equals(other.definicja))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\"" + definicja + "\"";
	}

}
