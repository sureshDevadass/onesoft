package com.onesoft.day7;

public class ToFindMaxString {
	public static void main(String[] args) {
		
		String[] s= {"SURESH","ONESOFT","TRAINING CENTRE"};
		int max=s[0].length();
		String m="";
		
		
		for (int i = 0; i < s.length; i++) {
			
			if(s[i].length()>max)
			{
				max=s[i].length();
				m=s[i];
				
				}
		}
	
		System.out.println(max);
		System.out.println(m);
	}

}
