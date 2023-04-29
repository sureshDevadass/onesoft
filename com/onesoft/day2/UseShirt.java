package com.onesoft.day2;

public class UseShirt {
	
	public static void main(String[] args) {
		Shirt s=new Shirt();
		s.brand="Levis";
		s.size="XL";
		s.price=1500f;
		s.discount=5/100f;
		s.netPrice=s.price-(s.price*s.discount);
		System.out.println(s.netPrice);
		
	}

}
