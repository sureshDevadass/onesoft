package com.onesoft.day2test;

public class UseAirConditioner {
	
	public static void main(String[] args) {
		
		AirConditioner ac=new AirConditioner();
		
		ac.brand="BlueStar";
		ac.price=35000;
		ac.noOfWings=5;
		ac.isQuality=true;
		
		System.out.println("Brand : "+ac.brand+" Price: "+ac.price+" No Of Wings : "+ac.noOfWings+" IsQuality : "+ac.isQuality);
		
		AirConditioner ac1=new AirConditioner();
		
		ac1.brand="Carrier";
		ac1.price=32000;
		ac1.noOfWings=4;
		ac1.isQuality=true;
		
		System.out.println("Brand : "+ac1.brand+" Price: "+ac1.price+" No Of Wings : "+ac1.noOfWings+" IsQuality : "+ac1.isQuality);
		
		
		
		
	}
	
}
