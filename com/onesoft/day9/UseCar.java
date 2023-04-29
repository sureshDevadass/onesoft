package com.onesoft.day9;

public class UseCar {

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.brand = "MARUTI";
		c1.color = "WHITE";
		c1.model = "SWIFT";
		c1.price = 1100000;
		c1.netPrice = c1.price + c1.price * 5 / 100;
		System.out.println(c1.netPrice);
		System.out.println(c1.toFindNetPrice(5));

		System.out.println(c1.brand + "," + c1.color + "," + c1.model + "," + c1.netPrice);
		c1.toDisplay();
		c1.toFindType();
		System.out.println("\n");
		Car c2 = new Car();

		c2.brand = "NISSAN";
		c2.color = "GREY";
		c2.model = "DUSTER";
		c2.price = 1800000;
		c2.netPrice = c1.price + c1.price * 7 / 100;
		System.out.println(c2.netPrice);
		System.out.println(c2.toFindNetPrice(7));
		System.out.println(c2.brand + "," + c2.color + "," + c2.model + "," + c2.netPrice);
		c2.toDisplay();
		c2.toFindType();
		System.out.println("\n");
		
		Car c3 = new Car();

		c3.brand = "TOYOTA";
		c3.color = "BLACK";
		c3.model = "FORTUNER";
		c3.price = 3500000;
		c3.netPrice = c1.price + c1.price * 9 / 100;
		System.out.println(c3.netPrice);
		System.out.println(c3.toFindNetPrice(9));
		System.out.println(c3.brand + "," + c3.color + "," + c3.model + "," + c3.netPrice);
		c3.toDisplay();
		c3.toFindType();
		System.out.println("\n");
		
		Car c4 = new Car();

		c4.brand = "MAHINDRA";
		c4.color = "BLUE";
		c4.model = "SCORPIO";
		c4.price = 2500000;
		c4.netPrice = c1.price + c1.price * 8 / 100;
		System.out.println(c4.netPrice);
		System.out.println(c4.toFindNetPrice(8));
		System.out.println(c4.brand + "," + c4.color + "," + c4.model + "," + c4.netPrice);
		c4.toDisplay();
		c4.toFindType();
		System.out.println("\n");
		Car c5 = new Car();

		c5.brand = "TATA";
		c5.color = "RED";
		c5.model = "TIGOR";
		c5.price = 800000;
		c5.netPrice = c5.price + c5.price * 5 / 100;
		System.out.println(c5.netPrice);
		System.out.println(c5.toFindNetPrice(5));
		System.out.println(c5.brand + "," + c5.color + "," + c5.model + "," + c5.netPrice);
		c5.toDisplay();
		c5.toFindType();
		System.out.println("\n");
		
		Car[] cars= {c1,c2,c3,c4,c5};
		
		c2.toFind(cars).toDisplay();;
	
	}
}
