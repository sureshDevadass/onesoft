package com.onesoft.day2;

public class UseMobile {
	public static void main(String[] args) {
		
		Mobile m=new Mobile();
		m.brand="Samsung";
		m.price=20000;
		m.isFeatherTouch=true;
		m.ram=4;
		m.chargerType='C';
		m.colour="GOLD";
		System.out.println(m.brand+" "+m.colour+" "+m.price+" "+m.isFeatherTouch+" "+m.ram+" "+m.chargerType+" "+m.colour);
	}

}
