package dad.codesignal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CenturyFromTestYearTest {
private TheJourneyBegins tjb;
	
	@Before
	public void setup() {
		tjb = new TheJourneyBegins();
	}
	
	@Test
	public void test1() {
		assertEquals(17, tjb.CenturyFromYear(1700));				
	}
	
	@Test
	public void test2() {
		assertEquals(20, tjb.CenturyFromYear(2000));				
	}
	
	@Test
	public void test3() {
		assertEquals(21,tjb.CenturyFromYear(2001));				
	}
	@Test
	public void test4() {
		assertEquals(2, tjb.CenturyFromYear(200));				
	}
	
	
}
