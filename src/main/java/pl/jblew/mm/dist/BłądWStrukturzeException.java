package pl.jblew.mm.dist;

import pl.jblew.mm.generator.GeneratorSkip;

@GeneratorSkip
public class BłądWStrukturzeException extends RuntimeException {

	public BłądWStrukturzeException() {
		super();
	}

	public BłądWStrukturzeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BłądWStrukturzeException(String message, Throwable cause) {
		super(message, cause);
	}

	public BłądWStrukturzeException(String message) {
		super(message);
	}

	public BłądWStrukturzeException(Throwable cause) {
		super(cause);
	}

}
