package pl.jblew.mm;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;

import static pl.jblew.mm.dist.StaticUtils._constructor;

public class Tool {
	public static final Tool Tool = new Tool();

	protected Tool() {
		_constructor();
	}

	public static void main(String[] args) throws IOException {
		String classContent = FileUtils.readFileToString(new File("src/main/java/pl/jblew/mm/wzór.tpl"), "UTF-8");
		File rootDir = new File("src/patogeny/wirusy/pl/jblew/mm/wirusy");
		Map<String, String[]> classes = new HashMap<>();

		classes.put("papillomawirusy", new String[] { "Papillomawirus", "HPV" });

		classes.put("polyomawirusy", new String[] { "Polyomawirus", "BKV", "JCV" });

		classes.put("Adenowirusy", new String[] { "Adenowirus" });

		classes.put("Herpeswirusy", new String[] { "Herpeswirus", "HSV", "VZV", "EBV", "CMV",
				"HHV6"/* Wirus rumienia nagłego */, "HHV7", "KSHV" });

		classes.put("Poxwirusy", new String[] { "Poxwirus", "VARV", "VACV", "MPXV", "MOCV" });

		classes.put("Parvowirusy", new String[] { "Parvowirus", "B19", "AAV" });

		classes.put("Picornawirusy",
				new String[] { "Picornawirus", "WirusPolio", "WirusyCoxsackie", "WirusECHO", "HAV", "Rinowirus" });

		classes.put("Koronawirusy", new String[] { "Koronawirus", "SARS_CoV" });

		classes.put("Norwirusy", new String[] { "Norwirus", "WirusNorwalk" });

		classes.put("Paramyksowirusy", new String[] { "Paramyksowirus", "WirusOdry", "WirusŚwinki", "WirusParagrypy",
				"RSV", "Metapneumowirus" });

		classes.put("Ortomyksowirusy", new String[] { "WirusGrypy" });

		classes.put("Hepadnawirusy", new String[] { "Hepadnawirus", "HBV", "HDV" });

		classes.put("Hepewirusy", new String[] { "Hepewirus", "HEV" });

		classes.put("Rabdowirusy", new String[] { "Rabdowirus", "WirusWściekizny" });

		classes.put("Filowirusy", new String[] { "Filowirus", "WirusMarburg", "WirusEbola" });

		classes.put("Bornawirusy", new String[] { "Bornawirus", "WirusChorobyBorna" });

		classes.put("Reowirusy",
				new String[] { "ReowirusGrupa", "Reowirusy", "Rotawirusy", "Coltiwirusy", "Orbiwirusy" });

		classes.put("Togawirusy",
				new String[] { "Togawirus", "BarmahForestVirus", "WirusCzikunguni", "MayaroVirus",
						"WirusGorączkiONyongNyona", "RossRiverVirus", "SemlikiForestVirus", "SindbisVirus", "UnaVirus",
						"EasternEquineEncephalitisVirus", "TonateVirus", "VenezuelanEquineEncephalitisVirus",
						"WesternEquineEncephalitisVirus", "WirusRóżyczki" });

		classes.put("Flawiwirusy", new String[] { "Flawiwirus", "TBEV", "WirusDengi", "WirusZachodniegoNilu",
				"WirusŻółtejGorączki", "WirusZika", "HCV", "HGV" });

		classes.put("Bunyawirusy", new String[] { "Bunyawirus" });

		classes.put("Arenawirusy", new String[] { "Arenawirus" });

		classes.put("Retrowirusy", new String[] { "Retrowirus", "HIV", "HTLV" });

		int i = 1;
		for (String key : classes.keySet()) {
			File dir = new File(rootDir.getPath() + "/" + key.toLowerCase());
			dir.mkdir();

			String[] group = classes.get(key);
			int iPkg = 0;
			for (String clazzName : group) {
				File f = new File(dir.getPath() + "/" + clazzName + ".java");

				String content = classContent.replace("{pkg}", key.toLowerCase()).replace("{wirname}", clazzName)
						.replace("{parentwir}", (iPkg == 0 ? "Wirus" : group[0]));

				f.createNewFile();
				FileUtils.write(f, content);

				System.out.println(i + ". " + f + ": \n" + content + "\n\n");
				i++;
				iPkg++;
			}

		}
	}
}
