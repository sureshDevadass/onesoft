package com.onesoft.day11;

public class StationaryProduct {
	
	String brand;
	int price;
	
	public StationaryProduct(String brand,int price)
	{
		this.brand=brand;
		this.price=price;
	}
	public String toString()
	{
		return brand+","+price;
	}

}
