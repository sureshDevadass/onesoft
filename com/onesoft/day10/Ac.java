package com.onesoft.day10;

public class Ac {
	
	private String brand;
	private int price; 
	private Compressor compressor;
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setCompressor(Compressor compressor)
	{
		this.compressor=compressor;
	}
	
	public String getBrand() {
		
		return brand;
	}
	public int getPrice()
	{
		return price;
	}
	public Compressor getCompressor()
	{
		return compressor;
	}

}
