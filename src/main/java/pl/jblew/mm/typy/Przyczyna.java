package pl.jblew.mm.typy;

public class Przyczyna extends Stan {
	private final Stan stan;
	private final String wyjaśnienie;

	public Przyczyna(Stan stan, String wyjaśnienie) {
		super();
		this.stan = stan;
		this.wyjaśnienie = wyjaśnienie;
	}

	public Przyczyna(String wyjaśnienie) {
		super();
		this.stan = null;
		this.wyjaśnienie = wyjaśnienie;
	}

	@Override
	public String definicja() {
		return (stan == null ? wyjaśnienie
				: stan.getClass().getSimpleName() + " (" + stan.definicja() + "): " + wyjaśnienie);
	}
}
