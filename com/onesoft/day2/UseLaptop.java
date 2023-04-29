package com.onesoft.day2;

public class UseLaptop {
	public static void main(String[] args) {
		
	
	Laptop l=new Laptop();
	l.company="DELL";
	l.price=35000;
	l.color="Black";
	l.processor="AMD Ryzen 5 SERIES";
	l.hardDisk="500GB";
	l.ram=8;
	System.out.println(l.company+" "+l.price+" "+l.color+" "+l.processor+" "+l.hardDisk+" "+l.ram);
	}

}
