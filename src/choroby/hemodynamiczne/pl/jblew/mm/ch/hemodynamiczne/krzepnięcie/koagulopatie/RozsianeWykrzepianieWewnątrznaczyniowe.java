package pl.jblew.mm.ch.hemodynamiczne.krzepnięcie.koagulopatie;

import pl.jblew.mm.ch.ogólnie.Choroba;

public class RozsianeWykrzepianieWewnątrznaczyniowe extends Choroba {
	public static final RozsianeWykrzepianieWewnątrznaczyniowe RozsianeWykrzepianieWewnątrznaczyniowe = new RozsianeWykrzepianieWewnątrznaczyniowe();

	protected RozsianeWykrzepianieWewnątrznaczyniowe() {
	}

	@Override
	public String definicja() {
		return "Nagłe lub podstępne pojawienie się zakrzepów włóknikowych w mikrokrążeniu,"
				+ " które prowadzi do niewydolności krążenia w różnych narządach, oraz koagulopatii ze zużycia";
	}
}
