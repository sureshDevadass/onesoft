package com.onesoft.day11;

public class Rubber extends StationaryProduct {
	
	
    private String color;
	private boolean isSmooth;

	public Rubber(String brand,int price,String color, boolean isSmooth) {
		super(brand,price);
		this.color=color;
		this.isSmooth = isSmooth;
	}
	public String toString()
	{
		return color+","+isSmooth+","+super.toString();
	}

}
