package pl.jblew.mm.ch.immunologiczne.autoimmunologiczne;

import pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2.ChorobaAutoimmunologiczna;
import pl.jblew.mm.ch.ogólnie.Choroba;

public class Nadwrażliwość extends Choroba implements ChorobaAutoimmunologiczna {
	public static final Nadwrażliwość Nadwrażliwość = new Nadwrażliwość("-", "-");

	private final String antygen;
	private final String mechanizmNiszczenia;

	protected Nadwrażliwość(String antygen, String mechanizmNiszczenia) {
		this.antygen = antygen;
		this.mechanizmNiszczenia = mechanizmNiszczenia;
	}

	@Override
	public String docelowyAntygen() {
		return this.antygen;
	}

	@Override
	public String mechanizmNiszczenia() {
		return this.mechanizmNiszczenia;
	}

	@Override
	public String toInlineString() {
		return getClass().getSimpleName() + " {antygen: " + docelowyAntygen() + "}";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((antygen == null) ? 0 : antygen.hashCode());
		result = prime * result + ((mechanizmNiszczenia == null) ? 0 : mechanizmNiszczenia.hashCode());
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
		Nadwrażliwość other = (Nadwrażliwość) obj;
		if (antygen == null) {
			if (other.antygen != null)
				return false;
		} else if (!antygen.equals(other.antygen))
			return false;
		if (mechanizmNiszczenia == null) {
			if (other.mechanizmNiszczenia != null)
				return false;
		} else if (!mechanizmNiszczenia.equals(other.mechanizmNiszczenia))
			return false;
		return true;
	}

}
