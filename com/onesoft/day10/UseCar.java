package com.onesoft.day10;

public class UseCar {
	public static void main(String[] args) {
	
	Engine e=new Engine();
	e.engineBrand="SHARP";
	e.enginecc=6600;
	e.noOfPiston=6;
	
	Car c=new Car();
	c.brand="NISSAN";
	c.engine=e;
	c.price=800000;
	
	System.out.println("BRAND: "+c.brand+" "+" PRICE : "+c.price);
	System.out.println("ENGINE BRAND: "+c.engine.engineBrand+" "+" ENGINE CC : "+c.engine.enginecc+" "+" NO OF PISTON : "+c.engine.noOfPiston);
	
	}
}
