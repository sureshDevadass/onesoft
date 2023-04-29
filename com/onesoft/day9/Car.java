package com.onesoft.day9;

public class Car {

	int price;
	String brand;
	String model;
	String color;
	int netPrice;

	public int toFindNetPrice(int taxPercentage) {
		return price + price * taxPercentage / 100;
	}

	public void toDisplay() {
		System.out.println(brand + "," + color + "," + model + "," + netPrice);
	}

	public void toFindType() {

		if (netPrice > 1500000) {
			System.out.println("LUXURY VEHICLE");
		} else {
			System.out.println("ITS NOT A LUXURY SEGMENT");
		}
	}

	public Car toFind(Car[] cs) {
		Car max = cs[0];
		for (Car c : cs) {
			if (max.price < c.price) {
				max = c;
			}
		}
		return max;

	}
	
		
		
		
	

}