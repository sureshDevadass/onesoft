package com.onesoft.day9;

public class UseAddtion {

	public static void main(String[] args) {
		
		Addition a=new Addition();
		
		a.num1=10;
		a.num2=25;
		
		System.out.println(a.add());
		System.out.println(a.add1(25, 35));
		a.add2();
		a.add3(50, 50);
		
	}
}
