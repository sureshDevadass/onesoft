package com.onesoft.day3;

public class Test7 {
	public static void main(String[] args) {
		
		String s="Welcome,to,my,World";
		String[] sp = s.split(",");
		
		System.out.println("Index Position of c ic : "+ sp[0].indexOf('c'));
		System.out.println(sp[3].substring(1,4));
		
		System.out.println("IS Welcome and world starts with same letter : "+sp[0].startsWith("W")+" "
		+sp[3].startsWith("w"));
		
		char c = sp[0].charAt(0);
		char cc = sp[3].charAt(0);
		
		System.out.println("IS Welcome and world starts with same letter : " + (c==cc));
		
		
	}

}
