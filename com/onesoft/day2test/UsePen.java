package com.onesoft.day2test;

public class UsePen {
	public static void main(String[] args)

	{
		Pen p = new Pen();

		p.brand = "Cello";
		p.price = 10;
		p.isBlueColor = true;
		p.tipWidth = 0.5f;
		
		Pen p1 = new Pen();
		
		p1.brand = "Reynolds";
		p1.price = 6;
		p1.isBlueColor = true;
		p1.tipWidth = 0.8f;
		Pen p2 = new Pen();
		
		p2.brand = "Hero";
		p2.price = 15;
		p.isBlueColor = false;
		p2.tipWidth = 0.7f;

		p.averagePrice = (p.price + p1.price + p2.price) / 3f;

		System.out.println("Average Value For the Price of Pen Object is: " + p.averagePrice);

	}

}
