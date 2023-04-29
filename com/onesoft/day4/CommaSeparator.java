package com.onesoft.day4;

public class CommaSeparator {
	
	public static void main(String[] args) {
		
		String s=args[0];
		String[] sp = s.split(",");
		char c = sp[1].charAt(0);
		char c1=sp[0].charAt((sp[0].length()-1));
		System.out.println(c);
		System.out.println(c1);
		
		
	}

}
