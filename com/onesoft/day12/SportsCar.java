package com.onesoft.day12;

public class SportsCar implements Car{

	
	public String brand(String brand) {
		
		return brand;
	}


	public boolean isElectric(boolean isElectric) {
		
		if(isElectric==true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	
	public int price(int price) {
		
		int netPrice=price+price*5/100;
		return netPrice;
		
		
	}
	
	public String color(String color) {
		
		return "White";
	}



	
}
