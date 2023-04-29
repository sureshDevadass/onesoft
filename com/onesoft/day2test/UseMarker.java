package com.onesoft.day2test;

public class UseMarker {
	public static void main(String[] args) {

		Marker m = new Marker();
		m.price = 50;
		m.color = "Blue";
		m.weight = 20;
		m.isQuality = true;

		System.out.println(
				"Price : " + m.price + " Color : " + m.color + " Weight : " + m.weight + " IsQuality : " + m.isQuality);

		Marker m1 = new Marker();
		m1.price = 60;
		m1.color = "Black";
		m1.weight = 15;
		m1.isQuality = true;

		System.out.println("Price : " + m1.price + " Color : " + m1.color + " Weight : " + m1.weight + " IsQuality : "
				+ m1.isQuality);

		Marker m2 = new Marker();

		m2.price = 70;
		m2.color = "Red";
		m2.weight = 25;
		m2.isQuality = true;

		System.out.println("Price : " + m2.price + " Color : " + m2.color + " Weight : " + m2.weight + " IsQuality : "
				+ m2.isQuality);

	}
}
