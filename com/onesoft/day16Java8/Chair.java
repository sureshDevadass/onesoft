package com.onesoft.day16Java8;

public class Chair implements Furniture {

	@Override
	public String printFurniture(String Furniture) {
				return "Hello";
	}
	
	public String printMaterial(String materail) {
		return "Overide Material : " + materail;
	}
	public static String findPrice(int price)
	{
		return "The Price : "+ (price+3000);
	}

	
	
	}
