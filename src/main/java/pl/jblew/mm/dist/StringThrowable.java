package pl.jblew.mm.dist;

import pl.jblew.mm.generator.GeneratorSkip;

@GeneratorSkip
public class StringThrowable extends RuntimeException {

	public StringThrowable(String message) {
		super(message);
	}

}
