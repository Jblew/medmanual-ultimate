package pl.jblew.mm.typy;

public class KombinacjaStanów extends Stan {
	public final Stan[] kombinacja;

	public KombinacjaStanów(Stan... kombinacja) {
		super();
		this.kombinacja = kombinacja;
	}

}
