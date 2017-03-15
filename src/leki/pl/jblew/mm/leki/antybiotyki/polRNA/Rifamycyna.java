package pl.jblew.mm.leki.antybiotyki.polRNA;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.leki.antybiotyki.Antybiotyk;

public class Rifamycyna extends Antybiotyk {
	public static final Rifamycyna Rifamycyna = new Rifamycyna();

	protected Rifamycyna() {
		_constructor();
	}

	public static class Rifampicyna extends Rifamycyna {
		public static final Rifampicyna Rifampicyna = new Rifampicyna();

		protected Rifampicyna() {
			_constructor();
		}
	}
}
