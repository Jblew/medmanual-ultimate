package pl.jblew.mm.generator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@GeneratorSkip
public class ClassParser {
	public ClassParser() {
	}

	public Map<Class<?>, ClassLink> parse(List<Class<?>> classes) {
		Map<Class<?>, ClassLink> links = new HashMap<>();

		for (Class<?> c : classes) {
			if (!c.isAnonymousClass() && !c.isMemberClass()) {
				String path = c.getName().replace(".", "/") + ".html";
				ClassLink cl = new ClassLink(c, path);
				links.put(c, cl);
			}
		}

		return links;
	}

}
