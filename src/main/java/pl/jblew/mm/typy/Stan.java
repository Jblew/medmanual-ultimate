package pl.jblew.mm.typy;

import pl.jblew.mm.dist.NotImplementedYetException;

public abstract class Stan {
	public abstract String definicja();

	public Stan[] przyczyny() {
		throw new NotImplementedYetException();
	}

	public Stan[] skutki() {
		throw new NotImplementedYetException();
	}

	public static final Stan kombinacja(Stan... stany) {
		return new KombinacjaStanów(stany);
	}
}
