package pl.jblew.mm.generator;

import java.util.ArrayList;
import java.util.List;

@GeneratorSkip
public class ClassParser {
	public ClassParser() {
	}

	public ClassLink[] parse(List<Class<?>> classes) {
		List<ClassLink> links = new ArrayList<>();

		for (Class<?> c : classes) {
			String path = c.getName().replace(".", "/") + ".html";
			ClassLink cl = new ClassLink(c, path);
			links.add(cl);
		}

		return links.toArray(new ClassLink[] {});
	}

}
