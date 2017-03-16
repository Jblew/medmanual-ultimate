package pl.jblew.mm.ch.immunologiczne.niedobory.pierwotne.odpowiedziwrodzonej;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.ch.immunologiczne.niedobory.pierwotne.PierwotnyNiedobórOdporności;

public class GenetycznyNiedobórSkładnikówOdpowiedziWrodzonej extends PierwotnyNiedobórOdporności {
	public static final GenetycznyNiedobórSkładnikówOdpowiedziWrodzonej GenetycznyNiedobórSkładnikówOdpowiedziWrodzonej = new GenetycznyNiedobórSkładnikówOdpowiedziWrodzonej();

	protected GenetycznyNiedobórSkładnikówOdpowiedziWrodzonej() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Zaburzenia genetyczne powodujące zmiany cząsteczek i komórek biorących udział w odpowiedzi wczesnej.";
	}
}
