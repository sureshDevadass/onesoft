package com.onesoft.day12;

public class UseCar extends SportsCar {
public static void main(String[] args) {
	
	SportsCar sc= new SportsCar();
	System.out.println(sc.brand("Surseh"));
	System.out.println(sc.color("White"));
	System.out.println(sc.isElectric(false));
	System.out.println(sc.price(1800000));
	
	
	
}
}
