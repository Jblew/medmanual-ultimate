package pl.jblew.mm.ch.immunologiczne.antygeny;

import static pl.jblew.mm.dist.StaticUtils._constructor;

import pl.jblew.mm.typy.Stan;

public class Antygen extends Stan {
	public static final Antygen Antygen = new Antygen();

	protected Antygen() {
		_constructor();
	}

	@Override
	public String definicja() {
		return "Substancja, która wykazuje immunogenność, czyli właściwość wywołania przeciw sobie "
				+ "odpowiedzi odpornościowej, lub antygenowość, czyli właściwość wiązania się "
				+ "ze swoistymi przeciwciałami.";
	}
}