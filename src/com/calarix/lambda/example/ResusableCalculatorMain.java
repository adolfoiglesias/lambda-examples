/**
 * 
 */
package com.calarix.lambda.example;

import com.calarix.lambda.example.interfaces.Calculator;

/**
 * @author amich
 *
 */
public class ResusableCalculatorMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Calculator calculator;
		
		// sum numbers
		calculator = (num1, num2) -> num1 + num2;
		System.out.println(calculator.calculate(5, 2));
		
		// multiply
		calculator = (num1, num2) -> num1 * num2;
		System.out.println(calculator.calculate(5, 2));
		
		// divide
		calculator = (num1, num2) -> num1 / num2;
		System.out.println(calculator.calculate(15, 3));		

	}

}
