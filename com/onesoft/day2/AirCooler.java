package com.onesoft.day2;

public class AirCooler {

	String companyName;
	int Price;
	String capacity;
	boolean isInvertorAvailable;
	String star;
	boolean isDisplayAvailable;
	int modelNo;
	
	public String toString() {
		return("Company Name:"+companyName+" "+"PRICE :"+Price+" "+"STAR :"+star+" "+"CAPACITY : "+capacity+" "+"DISPLAY : "+isDisplayAvailable+" "+"INVERTOR : "+isInvertorAvailable+" "+"MODEL : "+modelNo);
	}
}
