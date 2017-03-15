package pl.jblew.mm.typy;

public class Skutek extends Stan {
	private final Stan stan;
	private final String wyjaśnienie;

	public Skutek(Stan stan, String wyjaśnienie) {
		super();
		this.stan = stan;
		this.wyjaśnienie = wyjaśnienie;
	}

	public Skutek(String wyjaśnienie) {
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
