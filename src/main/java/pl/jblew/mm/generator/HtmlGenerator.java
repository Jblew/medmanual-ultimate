package pl.jblew.mm.generator;

@GeneratorSkip
public class HtmlGenerator {
	private HtmlGenerator() {
	};

	public static String toHtml(String title, String content) {
		return "<!doctype html>" + "<html lang=\"en\">" + "<head>" + "<meta charset=\"utf-8\">" + "<title>" + title
				+ "</title>" + "</head>" + "<body>" + content + "</body>" + "</html>";
	}
}
