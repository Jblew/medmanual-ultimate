package pl.jblew.mm.badania.krwi;

import pl.jblew.mm.adnotacje.Comment;
import pl.jblew.mm.adnotacje.Image;
import pl.jblew.mm.badania.materiały.KrewŻylna;
import pl.jblew.mm.badania.materiały.Materiał;

@Image(url="probowki.png") /*






























*/
public enum RodzajProbówki {

	@Comment(text="Może zawierać aktywator wykrzepiania zamiast antykoagulantu")
	NA_SKRZEP("Czerwony", null, new Materiał [] {KrewŻylna.Surowica.I()}),
	Z_EDTA("Fioletowy", Antykoagulant.EDTA, new Materiał [] {KrewŻylna.Pełna.I(), KrewŻylna.Osocze.I()}),
	
	Z_CYTRYNIANEM("Niebieski", Antykoagulant.CytrynianSodowy, new Materiał [] {KrewŻylna.Osocze.I()}),
	Z_FLUORKIEM_SODOWYM("Biały", Antykoagulant.FluorekSodowy, new Materiał [] {KrewŻylna.Osocze.I()}),
	Z_HEPARYNĄ("Zielony", Antykoagulant.Heparyna, new Materiał [] {KrewŻylna.Pełna.I(), KrewŻylna.Osocze.I()});
	
	public final String kolorKorka;
	public final Antykoagulant antykoagulant;
	public final Materiał [] materiały;
	
	private RodzajProbówki(String kolorKorka, Antykoagulant antykoagulant, Materiał [] materiały) {
		this.kolorKorka = kolorKorka;
		this.antykoagulant = antykoagulant;
		this.materiały = materiały;
	}
}
