package com.onesoft.day16Java8;

public class UseStringImple {
	
	public static void main(String[] args) {
		
		String name="Suresh";
		
		StringImplementation upper=name::toUpperCase;
		
		System.out.println(upper.modify());
		
		upper.printName("suresh");
		
		System.out.println(StringImplementation.specify());
		
		StringImplementation lower=name::toLowerCase;
		System.out.println(lower.modify());
	}

}
