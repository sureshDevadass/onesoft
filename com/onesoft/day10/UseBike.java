package com.onesoft.day10;

public class UseBike {
	public static void main(String[] args) {
		Bike b=new Bike();
		b.setBrand("YAMAHA");
		b.setPrice(85000);
		b.setColor("BLACK");
		
		System.out.println("BRAND : "+b.getBrand()+"\n"+"PRICE :" +b.getPrice()+"\n"+"COLOR : "+b.getColor());
		
	}

}
