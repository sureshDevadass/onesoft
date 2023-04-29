package com.onesoft.day16Java8;

@FunctionalInterface
public interface Calculate {

	public int find(int a, int b);

	public static void print() {
		System.out.println("This File Does the Calculations");
	}

	public default String type() {
		return "Arithmetic Calulations";

	}

}
