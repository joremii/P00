import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public final void testAdd() {
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		int expected = 5555;
		assertEquals (expected,actual);
	}
	
	@Test
	public final void testSubtract() {
		int a = 20;
		int b = 5;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a,b);
		int expected = 15;
		assertEquals (expected, actual);
	}
	
	@Test 
	public final void testMultiply() {
		int a = 5;
		int b = 6;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a,b);
		int expected = 30;
		assertEquals (expected, actual);
	}
	
	@Test
	public final void testDivide() {
		int a = 20;
		int b = 10;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
		int expected = 2;
		assertEquals (expected,actual);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
