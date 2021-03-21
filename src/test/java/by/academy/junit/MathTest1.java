package by.academy.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(TestRunner.class)
public class MathTest1 extends Assert {
		
	@Test
	public void testPow() {
		assertTrue(Math.pow(2, 1) == 2);
		assertTrue(Math.pow(2, 2) == 4);
		assertTrue(Math.pow(2, 3) == 8);
		assertTrue(Math.pow(2, 4) == 16);
		assertTrue(Math.pow(2, 5) == 32);
		
	}
}
