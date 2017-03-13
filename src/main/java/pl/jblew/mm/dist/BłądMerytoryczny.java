package pl.jblew.mm.dist;

import pl.jblew.mm.generator.GeneratorSkip;

@GeneratorSkip
public class BłądMerytoryczny extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public BłądMerytoryczny(String message) {
		super(message);
	}

}
