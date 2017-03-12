package pl.jblew.mm.typy;

public abstract class Stan {
	public abstract String definicja();

	public static final Stan kombinacja(Stan... stany) {
		return new KombinacjaStanów(stany);
	}
}
