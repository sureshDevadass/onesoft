package com.onesoft.day7;

public class ToCheckVowel {
	public static void main(String[] args) {
		
		char[] c= {'A','A','B','B','I','I','D','D','E','E','E','F','F','G','G','O','K','K','U','U','U'};
		int count=0;
		for (int i = 0; i < c.length; i++) {
			
			if(c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U') {
				
				System.out.println(c[i]);
				count++;
				
			}
			
		}
		System.out.println("Count = "+count);
		
	}

}
