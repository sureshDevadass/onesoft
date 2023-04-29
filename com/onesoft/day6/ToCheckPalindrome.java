package com.onesoft.day6;

public class ToCheckPalindrome {
	public static void main(String[] args) {
		String s="madam";
		String temp="";
		for(int i=s.length()-1;i>=0;i--) {
			temp=temp+s.charAt(i);
			
		}
		if(s.equals(temp))
		{
			System.out.println("IT IS A PALINDROME");
		}
		else
		{
			System.out.println("IT IS NOT A PALINDROME");
		}
	}

}
