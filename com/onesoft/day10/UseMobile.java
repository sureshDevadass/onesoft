package com.onesoft.day10;

public class UseMobile {
	public static void main(String[] args) {
		
	Battery b=new Battery();
	b.capacity=6000;
	b.battertyPrice=2000;
	
	Mobile m=new Mobile();
	m.Name="SAMSUNG";
	m.price=20000;
	m.battery=b;
	
	System.out.println("NAME :"+m.Name+" "+" PRICE : "+m.price);
    System.out.println("BATERRY CAPACITY : "+m.battery.capacity+" "+" BATTERRY PRICE :"+m.battery.battertyPrice);	
	
	}

}
