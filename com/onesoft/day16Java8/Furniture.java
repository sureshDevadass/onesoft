package com.onesoft.day16Java8;

public interface Furniture {

	public default String printMaterial(String materail) {
		return "The Material : " + materail;
	}
	
	public static String findPrice(int price)
	{
		return "The Price : "+ (price+1000);
	}
	public String printFurniture(String Furniture);

}
