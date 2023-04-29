package com.onesoft.day9;

public class UseDivision {
public static void main(String[] args) {
	
	Division d=new Division();
	
	d.a=20;
	d.b=10;
	
	System.out.println(d.div());
	System.out.println(d.div1(100, 10));
	d.div2();
	d.div3(25, 5);
}
}
