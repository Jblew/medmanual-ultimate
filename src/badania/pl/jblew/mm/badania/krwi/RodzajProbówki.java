package pl.jblew.mm.badania.krwi;

import pl.jblew.mm.adnotacje.Comment;
import pl.jblew.mm.adnotacje.Image;
import pl.jblew.mm.badania.materiały.KrewŻylna;
import pl.jblew.mm.badania.materiały.Materiał;
import pl.jblew.mm.generator.GeneratorSkip;

@Image(url = "probowki.png") /*
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								
								*/
@GeneratorSkip
public enum RodzajProbówki {

	@Comment(text = "Może zawierać aktywator wykrzepiania zamiast antykoagulantu")
	NA_SKRZEP("Czerwony", null, new Materiał[] { KrewŻylna.Surowica.Surowica }), Z_EDTA("Fioletowy", Antykoagulant.EDTA, new Materiał[] { KrewŻylna.Pełna.Pełna, KrewŻylna.Osocze.Osocze }),

	Z_CYTRYNIANEM("Niebieski", Antykoagulant.CytrynianSodowy,
			new Materiał[] { KrewŻylna.Osocze.Osocze }), Z_FLUORKIEM_SODOWYM("Biały", Antykoagulant.FluorekSodowy,
					new Materiał[] { KrewŻylna.Osocze.Osocze }), Z_HEPARYNĄ("Zielony", Antykoagulant.Heparyna,
							new Materiał[] { KrewŻylna.Pełna.Pełna, KrewŻylna.Osocze.Osocze });

	public final String kolorKorka;
	public final Antykoagulant antykoagulant;
	public final Materiał[] materiały;

	private RodzajProbówki(String kolorKorka, Antykoagulant antykoagulant, Materiał[] materiały) {
		this.kolorKorka = kolorKorka;
		this.antykoagulant = antykoagulant;
		this.materiały = materiały;
	}
}
