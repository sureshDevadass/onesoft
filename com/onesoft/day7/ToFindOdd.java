package com.onesoft.day7;

public class ToFindOdd {
	public static void main(String[] args) {
		
		int[] a = { 10, 51, 60, 71, 80, 90, 100 };
		int count=0;
		
		for (int i = 1; i < a.length; i=i+2) {
			
			if(a[i]%2==0)
			{
			System.out.println(a[i]);
			count++;
			}
			
		}
		System.out.println("Count = "+count);
	
	}

}
