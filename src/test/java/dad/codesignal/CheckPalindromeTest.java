package dad.codesignal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import dad.codesignal.TheJourneyBegins;

public class CheckPalindromeTest {
	
	private TheJourneyBegins tjb;
	
	@Before
	public void setup() {
		tjb = new TheJourneyBegins();
	}
	
	@Test
	public void test1() {
		assertFalse(tjb.checkPalindrome("hola"));
	}
	
	@Test
	public void test2() {
		assertTrue(tjb.checkPalindrome("reconocer"));
	}
	
	@Test
	public void test3() {
		assertTrue(tjb.checkPalindrome("sometemos"));
	}
	
	@Test
	public void test4() {
		assertTrue(tjb.checkPalindrome("perejil"));
	}	
	
	
}
