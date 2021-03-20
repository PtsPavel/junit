package by.academy.junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class SimpleMathTest extends Assert {

	@Test
	public void testMathSum() {
		System.out.println("@testMathSum");
		assertEquals(4,Calculator.getSum(2, 2));
	}
	
	@Test
	public void testFail() {
		System.out.println("@testFail");
		fail();
	}
	
	@Test(timeout = 1000)
	@Ignore
	public void testTimout() {
		while(true) {
		System.out.println("alala");
		
		}
	}
	
	@Test(expected = ArithmeticException.class)
	public void testMathDevide() {
		System.out.println("@testMathDevide");
		int a = 1/0;
	}
}
