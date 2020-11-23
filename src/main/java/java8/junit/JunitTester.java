package java8.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTester {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}

	@Before
	public void before() {
		System.out.println("before ");
	}

	@Test
	public void testFindMax() {
		System.out.println("testFindMax ");
		assertEquals(4, Calculation.findMax(new int[] { 1, 3, 4, 2 }));
		//assertEquals(-1, Calculation.findMax(new int[] { -12, -1, -3, -4, -2 }));

	}
	
	@Test
	public void testFindMax1() {
		System.out.println("testFindMax1 ");
		assertTrue(Calculation.findMaxBoolean(new int[] { 1, 3, 4, 2 }));
		//assertEquals(-1, Calculation.findMax(new int[] { -12, -1, -3, -4, -2 }));

	}

	@After
	public void after() {
		System.out.println("after ");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}

}
