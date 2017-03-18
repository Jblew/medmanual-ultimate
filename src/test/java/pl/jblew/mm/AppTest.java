package pl.jblew.mm;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import pl.jblew.mm.adnotacje.Image;
import pl.jblew.mm.generator.GeneratorSkip;

/**
 * Unit test for simple App.
 */
@GeneratorSkip
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	@Image(url = "/Users/teofil/Pictures/falcon1.jpg")
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}
}
