package com.onesoft.day16Java8;

public interface StringImplementation {
	
	public String modify();
	
	public static String specify()
	{
		return"This Method Does String Operations";
	}
	public default void printName(String name)
	{
		System.out.println( "My Name is: "+name);
	}

}
