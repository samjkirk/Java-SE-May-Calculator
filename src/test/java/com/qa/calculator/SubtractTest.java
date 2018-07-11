package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SubtractTest {

	@Test
	public void subtractTest() {
		Subtract calc = new Subtract();
		int actualValue = calc.subtract(10, 5);
		Assert.assertEquals(5, actualValue);
	}

}
