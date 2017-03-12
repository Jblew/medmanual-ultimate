package pl.jblew.mm.typy;

import pl.jblew.mm.dist.NotImplementedYetException;

public class KombinacjaStanów extends Stan {
	public final Stan[] kombinacja;

	public KombinacjaStanów(Stan... kombinacja) {
		super();
		this.kombinacja = kombinacja;
	}

	@Override
	public String definicja() {
		throw new NotImplementedYetException();
	}

}
