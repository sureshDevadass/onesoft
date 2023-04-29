package com.onesoft.day4;

public class UseCalculator {
	public static void main(String[] args) {

		Calculator calc = new Calculator();
		System.out.println(calc.add(10, 2));
		System.out.println(calc.sub());
		calc.mul(10,2);
		calc.div();

	}
}
