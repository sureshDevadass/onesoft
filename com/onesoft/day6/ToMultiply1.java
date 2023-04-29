package com.onesoft.day6;

public class ToMultiply1 {
	public static void main(String[] args) {
		
		int temp=1;
		int temp1=0;
		for(int i=1;i<=5;i++)
		{
			temp=temp*i;
			temp1=temp1+temp;
		}
		System.out.println(temp1);
	}

}
