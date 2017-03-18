package pl.jblew.mm.ch.immunologiczne.autoimmunologiczne.typu2;

import pl.jblew.mm.dist.NotImplementedYetException;

public interface ChorobaAutoimmunologiczna {
	public static final ChorobaAutoimmunologiczna ChorobaAutoimmunologiczna = new ChorobaAutoimmunologiczna() {

		@Override
		public String docelowyAntygen() {
			throw new NotImplementedYetException();
		}

		@Override
		public String mechanizmNiszczenia() {
			throw new NotImplementedYetException();
		}

	};

	public String docelowyAntygen();

	public String mechanizmNiszczenia();
}
