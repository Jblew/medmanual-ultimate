package pl.jblew.mm;

import java.io.File;
import java.io.IOException;

import pl.jblew.mm.generator.DocGenerator;

/**
 * Autor: Jędrzej Lewandowski
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		if (args.length > 1) {
			String cmd = args[1];
			if (cmd.equals("generate")) {
				new DocGenerator("doc", new File("target/generated/sources/"), App.class).generate();
			}
		}
	}
}
