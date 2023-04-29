package com.onesoft.day13collection;

public class Bike {

	private String brand;
	private int price;
	private String color;
	private boolean isAlloyWheel;

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isAlloyWheel() {
		return isAlloyWheel;
	}

	public void setAlloyWheel(boolean isAlloyWheel) {
		this.isAlloyWheel = isAlloyWheel;
	}

	public Bike(String brand, int price, String color, boolean isAlloyWheel) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.isAlloyWheel = isAlloyWheel;
	}

	public String toString() {
		return "BRAND: " + brand + ",PRICE: " + price + ",COLOR: " + color + ",IS ALLOY WHEEL: " + isAlloyWheel;
	}

}
