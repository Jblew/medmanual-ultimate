package pl.jblew.mm.generator;

import java.util.Map;

@GeneratorSkip
public class TreeGenerator {

	public static String getTreeHtml(Map<Class<?>, ClassLink> links, ClassLink relative) {
		String out = "<h3>Tree</h3>";
		out += "<ul>";

		ClassLink[] sortedList = links.values().stream()
				.sorted((ClassLink cl1, ClassLink cl2) -> cl1.getClazz().getName().compareTo(cl2.getClazz().getName()))
				.toArray(ClassLink[]::new);

		for (ClassLink cl : sortedList) {
			out += "<li>" + cl.getClazz().getPackage().getName() + "." + GenericParser.getLink(cl.getClazz()) + "</li>";
		}
		out += "</ul>";
		return GenericParser.resolveLinks(out, links, relative);
	}

}
