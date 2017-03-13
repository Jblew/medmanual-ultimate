package pl.jblew.mm.ch.ogólnie;

import static pl.jblew.mm.dist.StaticUtils.array;

import pl.jblew.mm.dist.BłądMerytoryczny;
import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.typy.Stan;

public class Choroba extends Stan {
	public static final Choroba Choroba = new Choroba();

	protected Choroba() {
	}

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

	public Stan[] przyczyny() {
		throw new NotImplementedYetException();
	}

	public Stan[] skutki() {
		throw new NotImplementedYetException();
	}

	public Stan[] maKomponenty() {
		return array();
	}

	public Stan[] jestKomponentąDla() {
		return array();
	}
}
