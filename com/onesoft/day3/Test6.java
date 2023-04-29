package com.onesoft.day3;

public class Test6 {
	
	public static void main(String[] args) {
		
		String s="Welcome,to,my,world";
		String[] sp = s.split(",");
		System.out.println("Last Letter of MY is : "+sp[2].charAt(1));
		System.out.println(sp[2].concat(sp[3]).toUpperCase());
		System.out.println("Lenght of TO is : "+sp[1].length());
		System.out.println("Array Lenght is : "+sp.length);
	}

}
