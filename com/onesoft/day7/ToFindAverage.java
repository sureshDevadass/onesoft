package com.onesoft.day7;

public class ToFindAverage {
	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		
		int temp=0;
		
		for (int i = 0; i < a.length; i++) {
			
			temp=temp+a[i];
			
		}
		System.out.println(temp/a.length);
	}

}
