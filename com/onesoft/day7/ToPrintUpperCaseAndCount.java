package com.onesoft.day7;

public class ToPrintUpperCaseAndCount {
	public static void main(String[] args) {
		
		String[] s= {"SURESH","oneSoft","Traing","OMR"};
		int count=0;
		for (int i = 0; i < s.length; i++) {
			
			if(s[i].equals(s[i].toUpperCase()))
			{
				System.out.println(s[i]);
				count++;
			}
			
		}
		System.out.println("Count = "+count);
	}

}
