package com.onesoft.day2;

public class UseAirCooler {
	public static void main(String[] args) {
		
		AirCooler ac=new AirCooler();
		ac.companyName="BlueStar";
		ac.Price=35000;
		ac.star="5 STAR";
		ac.capacity="2 TON";
		ac.isDisplayAvailable=true;
		ac.isInvertorAvailable=true;
		ac.modelNo=584585;

//		System.out.println(ac.companyName+" "+ac.Price+" "+ac.star+" "+ac.capacity+" "+ac.isDisplayAvailable+" "+ac.isInvertorAvailable+" "+ac.modelNo);	
	    
		AirCooler ac1=new AirCooler();
		ac1.companyName="HITACHI";
		ac1.Price=32000;
		ac1.star="4 STAR";
		ac1.capacity="1.5TON";
		ac1.isDisplayAvailable=true;
		ac1.isInvertorAvailable=true;
		ac1.modelNo=587469;
		
//		System.out.println(ac1.companyName+" "+ac1.Price+" "+ac1.star+" "+ac1.capacity+" "+ac.isDisplayAvailable+" "+ac.isInvertorAvailable+" "+ac1.modelNo);
	
		System.out.println(ac);
		System.out.println(ac1);
	}

}
