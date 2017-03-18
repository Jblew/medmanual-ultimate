package pl.jblew.mm.typy;

import java.util.Arrays;
import java.util.stream.Collectors;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(kombinacja);
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
		KombinacjaStanów other = (KombinacjaStanów) obj;
		if (!Arrays.equals(kombinacja, other.kombinacja))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return Arrays.stream(kombinacja).map(i -> i.toString()).collect(Collectors.joining(" + "));
	}

}
