package pl.jblew.mm;

import java.io.File;
import java.io.IOException;

import pl.jblew.mm.generator.DocGenerator;
import pl.jblew.mm.generator.GeneratorSkip;

/**
 * Autor: Jędrzej Lewandowski
 *
 */
@GeneratorSkip
public class App {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// if (args.length > 1) {
		// String cmd = args[1];
		// if (cmd.equals("generate")) {
		DocGenerator g = new DocGenerator("doc", new File("latest.jar"), App.class);// .generate();
		g.generate();
		// }
		// }
	}
}
