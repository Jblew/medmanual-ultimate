package pl.jblew.mm.dist;

import pl.jblew.mm.generator.GeneratorSkip;

@GeneratorSkip
public abstract class MedmanualThrowable extends RuntimeException {

	public MedmanualThrowable() {
		super();
	}

	public MedmanualThrowable(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MedmanualThrowable(String message, Throwable cause) {
		super(message, cause);
	}

	public MedmanualThrowable(String message) {
		super(message);
	}

	public MedmanualThrowable(Throwable cause) {
		super(cause);
	}

}
