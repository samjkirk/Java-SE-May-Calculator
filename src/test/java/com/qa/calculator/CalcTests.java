package com.qa.calculator;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import com.qa.calculator.Calculator;

public class CalcTests {
	static Calculator calc;
	
	@BeforeClass
	public static void setUp() {
		calc = new Calculator();
	}

	@Test
	public void addTest() {
		double actualValue = calc.add(2, 2);
		Assert.assertEquals(4, actualValue, 0.001);
	}
	
	@Test
	public void multiplyTest() {
		double actualValue = calc.multi(2, 3);
		Assert.assertEquals(6, actualValue, 0.001);
	}
	
	@Test
	public void subtractTest() {
		double actualValue = calc.sub(10, 5);
		Assert.assertEquals(5, actualValue, 0.001);
	}
	
	@Test
	public void divideTest() {
		double actualValue = calc.div(5.0, 2.0);
		Assert.assertEquals(2.5, actualValue, 0.001);
	}

}
