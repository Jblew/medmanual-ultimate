package pl.jblew.mm;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import junit.framework.TestCase;
import pl.jblew.mm.dist.MedmanualThrowable;
import pl.jblew.mm.dist.NotImplementedYetException;
import pl.jblew.mm.generator.GeneratorSkip;
import pl.jblew.mm.generator.GenericParser;
import pl.jblew.mm.typy.Stan;

@GeneratorSkip
@RunWith(Parameterized.class)
public class TestDiseaseChainCompletion extends TestCase {
	private static final Map<Stan, ClassStats> stats = new HashMap<>();

	@Parameters(name = "{0}")
	public static Collection<Object[]> data() throws IOException {
		if (stats.isEmpty()) {
			List<Class<? extends Stan>> classes = listClasses(Paths.get("target/classes"));
			for (Class<? extends Stan> clazz : classes) {
				Stan stan = (Stan) GenericParser.findBestInstance(clazz);
				rejestrujStan(stats, stan);
			}

			for (Stan s1 : stats.keySet()) {
				for (Stan s2 : stats.keySet()) {
					stats.get(s1).konfrontuj(stats.get(s2));
				}
			}
		}
		return stats.keySet().stream().map(s -> new Object[] { s }).collect(Collectors.toList());
	}

	private static void rejestrujStan(Map<Stan, ClassStats> stats, Stan stan) {
		if (!stats.containsKey(stan)) {
			ClassStats cs = new ClassStats(stan);
			stats.put(stan, cs);
			for (Stan przyczyna : cs.maPrzyczyny) {
				rejestrujStan(stats, przyczyna);
			}
			for (Stan skutek : cs.maSkutki) {
				rejestrujStan(stats, skutek);
			}
		}
	}

	@SuppressWarnings("unchecked")
	private static List<Class<? extends Stan>> listClasses(Path dir) throws IOException {
		List<Class<? extends Stan>> out = new ArrayList<Class<? extends Stan>>();
		Files.walk(dir).filter(Files::isRegularFile).filter(p -> p.getFileName().toString().endsWith(".class"))
				.map(p -> dir.relativize(p).toString().replace(".class", "").replace("/", "."))
				.filter(className -> !className.equals(GeneratorSkip.class.getName())).map(className -> {
					try {
						return TestDiseaseChainCompletion.class.getClassLoader().loadClass(className);
					} catch (ClassNotFoundException e) {
						return null;
					}
				}).filter(clazz -> clazz != null).filter(clazz -> !clazz.isAnnotationPresent(GeneratorSkip.class))
				.filter(clazz -> Stan.class.isAssignableFrom(clazz)).map(clazz -> (Class<? extends Stan>) clazz)
				.forEach(path -> out.add(path));
		return out;
	}

	private final Stan stan;

	public TestDiseaseChainCompletion(Stan stan) {
		this.stan = stan;
	}

	@Test
	public void testBrakującePrzyczyny() {
		Stan[] brakującePrzyczyny = stats.get(stan).brakującePrzyczyny();
		if (brakującePrzyczyny.length > 0) {
			/*
			 * String msg = ""; for (Stan p : brakującePrzyczyny) { msg +=
			 * p.toString() + "; "; } fail(msg);
			 */
			throw new BrakującePrzyczyny(stan, brakującePrzyczyny);
		}
	}

	@Test
	public void testBrakująceSkutki() {
		Stan[] brakująceSkutki = stats.get(stan).brakująceSkutki();
		if (brakująceSkutki.length > 0) {
			/*
			 * String msg = "Brakujące skutki \n"; for (Stan p :
			 * brakująceSkutki) { msg += p.getClass().getName() + "\n: " +
			 * p.toString() + "; "; }
			 */
			throw new BrakująceSkutki(stan, brakująceSkutki);

		}
	}

	private static class ClassStats {
		public final Stan stan;
		public final Set<Stan> maPrzyczyny = new HashSet<Stan>();
		public final Set<Stan> powinienMiećPrzyczyny = new HashSet<Stan>();
		public final Set<Stan> maSkutki = new HashSet<Stan>();
		public final Set<Stan> powinienMiećSkutki = new HashSet<Stan>();

		public ClassStats(Stan stan) {
			this.stan = stan;
			try {
				maSkutki.addAll(Arrays.asList(stan.skutki()));
			} catch (NotImplementedYetException e) {
			} catch (MedmanualThrowable e) {
				e.printStackTrace();
			}

			try {
				maPrzyczyny.addAll(Arrays.asList(stan.przyczyny()));
			} catch (NotImplementedYetException e) {
			} catch (MedmanualThrowable e) {
				e.printStackTrace();
			}
		}

		public void konfrontuj(ClassStats innyStanStat) {
			if (innyStanStat != this && !stan.equals(innyStanStat.stan)) {
				for (Stan jegoPrzyczyna : innyStanStat.maPrzyczyny) {
					if (jegoPrzyczyna.equals(stan)) {
						this.powinienMiećSkutki.add(innyStanStat.stan);
					}
				}
				for (Stan jegoSkutek : innyStanStat.maSkutki) {
					if (jegoSkutek.equals(stan)) {
						this.powinienMiećPrzyczyny.add(innyStanStat.stan);
					}
				}

				for (Stan mojaPrzyczyna : this.maPrzyczyny) {
					if (mojaPrzyczyna.equals(innyStanStat.stan)) {
						innyStanStat.powinienMiećSkutki.add(this.stan);
					}
				}
				for (Stan mójSkutek : this.maSkutki) {
					if (mójSkutek.equals(innyStanStat.stan)) {
						innyStanStat.powinienMiećPrzyczyny.add(this.stan);
					}
				}
			}
		}

		public Stan[] brakująceSkutki() {
			return this.powinienMiećSkutki.stream().filter(s -> !maSkutki.contains(s)).toArray(Stan[]::new);
		}

		public Stan[] brakującePrzyczyny() {
			return this.powinienMiećPrzyczyny.stream().filter(s -> !maPrzyczyny.contains(s)).toArray(Stan[]::new);
		}
	}

	public static class BrakująceStany extends RuntimeException {
		public BrakująceStany(Stan gdzie, Stan[] brakujące, String mojaMetoda, String ichMetoda) {
			StackTraceElement[] stackTrace = new StackTraceElement[brakujące.length + 1];
			stackTrace[0] = new StackTraceElement(gdzie.getClass().getName(), mojaMetoda,
					gdzie.getClass().getSimpleName() + ".java", 0);

			for (int i = 0; i < brakujące.length; i++) {
				stackTrace[i + 1] = new StackTraceElement(brakujące[i].getClass().getName(), ichMetoda,
						brakujące[i].getClass().getSimpleName() + ".java", 0);
			}

			this.setStackTrace(stackTrace);
		}

	}

	public static class BrakującePrzyczyny extends BrakująceStany {

		public BrakującePrzyczyny(Stan gdzie, Stan[] brakujące) {
			super(gdzie, brakujące, "przyczyny", "skutki");
		}

	}

	public static class BrakująceSkutki extends BrakująceStany {

		public BrakująceSkutki(Stan gdzie, Stan[] brakujące) {
			super(gdzie, brakujące, "skutki", "przyczyny");
		}

	}
}
