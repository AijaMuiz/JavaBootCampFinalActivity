package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class SecondActivityTest extends TestCase {

	//TODO try to achieve 100% of test coverage

	private SecondActivity theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		theCalculator = new SecondActivity();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	//Example ->
	@Test
	public void testSumPositiveValue() {
		assertEquals(15.0, (theCalculator.sum(5, 10)));
		assertEquals(15.0, (theCalculator.sum(10, 5)));
	}

	//Example ->
	@Test
	public void testSumNegativeValue() {
		assertEquals(5.0, (theCalculator.sum(-5, 10)));
		assertEquals(-5.0, (theCalculator.sum(5, -10)));
	}
	
	public void testSubtractPositiveValue() {
		assertEquals(5.0, (theCalculator.subtract(15, 10)));
		assertEquals(15.0, (theCalculator.subtract(20, 5)));
	}
	public void testSubtractNegativeValue() {
		assertEquals(-15.0, (theCalculator.subtract(-5, 10)));
		assertEquals(-15.0, (theCalculator.subtract(-10, 5)));
	}

	public void testDividePositiveValue() {
		assertEquals(5.0, (theCalculator.divide(15, 3)));
		assertEquals(4.0, (theCalculator.divide(20, 5)));
	}
	public void testDivideNegativeValue() {
		assertEquals(-5.0, (theCalculator.divide(-15, 3)));
		assertEquals(-5.0, (theCalculator.divide(15, -3)));
	}
	public void testDivideNull() {
		assertEquals(0.0, (theCalculator.divide(0, 5)));
		assertEquals(Double.POSITIVE_INFINITY, (theCalculator.divide(5, 0)));
	}
	
	public void testMultiplyPositiveValue() {
		assertEquals(15.0, (theCalculator.multiply(5, 3)));
		assertEquals(20.0, (theCalculator.multiply(4, 5)));
	}
	public void testMultiplyNegativeValue() {
		assertEquals(-45.0, (theCalculator.multiply(-15, 3)));
		assertEquals(-12.0, (theCalculator.multiply(4, -3)));
	}
	public void testMultiplyNull() {
		assertEquals(0.0, (theCalculator.multiply(0, 5)));
		assertEquals(0.0, (theCalculator.multiply(5, 0)));
	}
	
}

