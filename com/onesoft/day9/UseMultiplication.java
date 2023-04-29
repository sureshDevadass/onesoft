package com.onesoft.day9;

public class UseMultiplication {
	public static void main(String[] args) {

		Multiplication m = new Multiplication();

		m.a = 10;
		m.b = 2;
		System.out.println(m.mul());
		System.out.println(m.mul1(5, 8));
		m.mul2();
		m.mul3(6, 6);
	}

}
