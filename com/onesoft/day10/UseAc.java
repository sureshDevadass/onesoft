package com.onesoft.day10;

public class UseAc {
	public static void main(String[] args) {
		
		Compressor c=new Compressor();
		c.setType("Alumunium");
		c.setCapacity(2);
		c.setIsInvertorType(true);
		
		Ac ac=new Ac();
		ac.setBrand("CARRIER");
		ac.setPrice(25000);
		ac.setCompressor(c);
		
		System.out.println("BRAND : "+ac.getBrand()+" "+" PRICE : "+ac.getPrice());
		System.out.println("TYPE : "+ac.getCompressor().getType()+" "+" CAPACITY :"+ac.getCompressor().getCapacity()+
				" "+" IS INVERTOR TYPE : "+ac.getCompressor().getIsInvertorType());
	}

}
