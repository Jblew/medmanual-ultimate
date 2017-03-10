package pl.jblew.mm.badania;

public class TekstowaZasadaPobierania extends ZasadaPobierania {
	public String zasada;

	public TekstowaZasadaPobierania(String zasada) {
		super();
		this.zasada = zasada;
	}

	@Override
	public String toString() {
		return zasada;
	}
	
	
}
