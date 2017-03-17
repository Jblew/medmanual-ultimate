package pl.jblew.mm.generator;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

@GeneratorSkip
public class HtmlGenerator {
	private static String template = null;

	private HtmlGenerator() {
	};

	private static String getTemplate() {
		if (template == null) {
			try (InputStream is = HtmlGenerator.class.getResourceAsStream("template.html")) {
				template = IOUtils.toString(is, "UTF-8");
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return template;
	}

	public static String toHtml(String title, String content, String tree) {
		return getTemplate().replace("{title}", title).replace("{content}", content).replace("{tree}", tree);
	}
}
