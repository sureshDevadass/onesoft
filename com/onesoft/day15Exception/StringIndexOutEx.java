package com.onesoft.day15Exception;

public class StringIndexOutEx {
public static void main(String[] args) {
	
	try {
		String s="Suresh";
		for (int i = 0; i <= s.length(); i++) {
			System.out.println(s.charAt(i));
			
		}
	} catch (Exception e) {
		System.out.println(e);
	}
	finally {
		System.out.println("Invalid");
	}
}
}
