package com.onesoft.day13collection;

public class Shirt {
	
	public Shirt(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	private String brand;
	private int price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Shirt [brand=" + brand + ", price=" + price + "]";
	}
	

}
