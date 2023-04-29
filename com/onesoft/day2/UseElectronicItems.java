package com.onesoft.day2;

public class UseElectronicItems {
	public static void main(String[] args) {
		
		ElectronicItems e=new ElectronicItems();
		e.name="TV";
		e.price=1500f;
		e.taxPercentage=5;
		e.netPrice=e.price+(e.price*e.taxPercentage/100f);
		System.out.println(e.netPrice);
		
		
	}

}
