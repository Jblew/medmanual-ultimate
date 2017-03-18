package pl.jblew.mm.ch.ogólnie;

import pl.jblew.mm.dist.BłądMerytoryczny;
import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.generator.GeneratorSkip;
import pl.jblew.mm.typy.Stan;

public class Choroba extends Stan {
	public static final Choroba Choroba = new Choroba();

	protected Choroba() {
	}

	@GeneratorSkip
	public Choroba nowotworowa() {
		if (this instanceof ChorobaNowotworowa) {
			return this;
		} else
			throw new BłądMerytoryczny("Ta choroba nie implementuje interfejsu ChorobaNowotworowa !");
	}

	@Override
	public String definicja() {
		throw new NotImplementedYetException();
	}

	public String epidemiologia() {
		throw new NotImplementedYetException();
	}

	/*
	 * // @MethodParser(method = "parseMaKomponenty") public Stan[]
	 * maKomponenty() { return array(); }
	 * 
	 * // @MethodParser(method = "parseJestKomponentąDla") public Stan[]
	 * jestKomponentąDla() { return array(); }
	 */

	/*
	 * @GeneratorSkip public String parseMaKomponenty() { String out = ""; }
	 * 
	 * @GeneratorSkip public String parseJestKomponentąDla() {
	 * 
	 * }
	 */
}
