package com.onesoft.day11;

public class UseClimbingBike {
	public static void main(String[] args) {
		
		ClimbingBike cb= new ClimbingBike();
		cb.brand="YAMAHA";
		cb.price=250000;
		cb.enginecc=6000;
		cb.weight=80.5f;
		System.out.println(cb.brand+","+cb.price+","+cb.enginecc+","+cb.weight);
	  System.out.println(cb);
	}

}
