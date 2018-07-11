package com.qa.calculator;

import com.qa.functions.Adder;
import com.qa.functions.Divider;
import com.qa.functions.Multiply;
import com.qa.functions.Subtracter;

public class Calculator {
	Adder adder = new Adder();
	Divider divider = new Divider();
	Multiply multiply = new Multiply();
	Subtracter subtracter = new Subtracter();

	public double add(double num1, double num2) {
		return adder.add(num1, num2);
	}
	
	public double div(double num1, double num2) {
		return divider.divide(num1, num2);
	}
	public double multi(double num1, double num2) {
		return multiply.multiply(num1, num2);
	}
	public double sub(double num1, double num2) {
		return subtracter.subtract(num1, num2);
	}
}
