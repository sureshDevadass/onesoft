package com.onesoft.day2;

public class UseHuman {
	public static void main(String[] args) {
		
		Human h=new Human();
		h.name="Rajiv";
		h.gender='M';
		h.age=55;
		h.height=5.11f;
		h.weight=75.8f;
		h.isPhysicallyChallenged=false;
		h.adhaarNumber=457865894512l;
		h.PanNo="DHFHGJL8D4";
		
		System.out.println("Name : "+h.name+" Gender : "+ h.gender+" Age : "+h.age+" Height : "+h.height+" Weight : "+h.weight+" Physically Challenged : "+h.isPhysicallyChallenged+" AdhaarNumber : "+h.adhaarNumber+" Pan No : "+h.PanNo);
	}

}
