package com.qa.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalcTests {
	Add add;
	Multiply multi;
	Subtract sub;
	Divide div;
	
	@Before
	public void setUp() {
		add = new Add();
		multi = new Multiply();
		sub = new Subtract();
	}

	@Test
	public void addTest() {
		int actualValue = add.add(2, 2);
		Assert.assertEquals(4, actualValue);
	}
	
	@Test
	public void multiplyTest() {
		int actualValue = multi.multiply(2, 3);
		Assert.assertEquals(6, actualValue);
	}
	
	@Test
	public void subtractTest() {
		int actualValue = sub.subtract(10, 5);
		Assert.assertEquals(5, actualValue);
	}
	
	@Test
	public void divideTest() {
		double actualValue = div.divide(10, 5);
		Assert.assertEquals(2, actualValue, 0.0);
	}

}
