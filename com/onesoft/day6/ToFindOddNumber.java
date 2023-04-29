package com.onesoft.day6;

public class ToFindOddNumber {
	public static void main(String[] args) {
		int a=0;
		for(int i=10;i<=20;i++){
			if(i%2!=0)
			{
				a++;
				System.out.println(i+ " is a Odd Number ");
			}
		}
		System.out.println("Count="+a);
	}

}
