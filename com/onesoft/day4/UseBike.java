package com.onesoft.day4;

public class UseBike {
	public static void main(String[] args) {
		String[] s = args[0].split(",");
		Bike b=new Bike();
		b.brand=s[0];
		b.price=Integer.parseInt(s[1]);
		b.color=s[2];
		System.out.println(b.brand+","+b.price+","+b.color);
		
		String[] sp=args[1].split(",");
		
		Bike b1=new Bike();
		b1.brand=sp[0];
		b1.price=Integer.parseInt(sp[1]);
		b1.color=sp[2];
		
		System.out.println(b1.brand+","+b1.price+","+b1.color);
		
		
	}
	

}

class Bike {
	
	String brand;
	int price;
	String color;
}
