package pl.jblew.mm.generator;

import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.dist.OddzielnaImplementacjaDlaKażdegoDziecka;
import pl.jblew.mm.typy.Stan;

public class ŚcieżkaStanów {
	private final Stan stan;
	private final Kierunek kierunek;

	public ŚcieżkaStanów(Stan stan, Kierunek kierunek) {
		this.stan = stan;
		this.kierunek = kierunek;
	}

	public String toHtml() {
		String out = "<table border=1><tr>";
		if (kierunek == Kierunek.PRZYCZYNY || kierunek == Kierunek.OBA) {
			out += "<td><table border=1>";
			try {
				for (Stan przyczyna : stan.przyczyny()) {
					out += "<tr><td>";
					out += new ŚcieżkaStanów(przyczyna, Kierunek.PRZYCZYNY).toHtml();
					out += "</td></tr>";
				}
			} catch (NotImplementedYetException | OddzielnaImplementacjaDlaKażdegoDziecka e) {

			}
			out += "</table></td>";
		}
		out += "<td>" + stan.toInlineString() + "</td>";
		if (kierunek == Kierunek.SKUTKI || kierunek == Kierunek.OBA) {
			out += "<td><table border=1>";
			try {
				for (Stan skutek : stan.skutki()) {
					out += "<tr><td>";
					out += new ŚcieżkaStanów(skutek, Kierunek.SKUTKI).toHtml();
					out += "</td></tr>";
				}
			} catch (NotImplementedYetException | OddzielnaImplementacjaDlaKażdegoDziecka e) {

			}
			out += "</table></td>";
		}
		out += "</table></tr>";
		return out;
	}

	public static enum Kierunek {
		PRZYCZYNY, SKUTKI, OBA
	}
}
