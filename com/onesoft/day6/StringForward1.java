package com.onesoft.day6;

public class StringForward1 {
	
	public static void main(String[] args) {
		
		String s="Suresh";
		String temp="";
		for(int i=0;i<s.length();i++) {
			
			temp=temp+s.charAt(i);
			
		}
		System.out.println(temp);
	}

}
