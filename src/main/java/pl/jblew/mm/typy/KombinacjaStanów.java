package pl.jblew.mm.typy;

import pl.jblew.mm.generator.GeneratorSkip;

@GeneratorSkip
public class KombinacjaStanów extends Stan {
	public final Stan[] kombinacja;

	public KombinacjaStanów(Stan... kombinacja) {
		super();
		this.kombinacja = kombinacja;
	}

	@Override
	public String definicja() {
		return this.toInlineString();
	}

	@Override
	public String toInlineString() {
		String out = "{ ";
		boolean first = true;
		for (Stan s : kombinacja) {
			if (!first)
				out += " + ";
			out += s.toInlineString();
			first = false;
		}
		out += " }";
		return out;
	}
}
