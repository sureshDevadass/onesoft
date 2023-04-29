package com.onesoft.day10;

public class Wood {
	
	private String material;
	private int price;
	private boolean isGood;
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isGood() {
		return isGood;
	}
	public void setGood(boolean isGood) {
		this.isGood = isGood;
	}
	
	public Wood(String material, int price, boolean isGood) {
		
		this.material = material;
		this.price = price;
		this.isGood = isGood;
	}
	
	public String toString() {
		return "Wood [material=" + material + ", price=" + price + ", isGood=" + isGood + "]";
	}
	
	
	
	
	
	

}
