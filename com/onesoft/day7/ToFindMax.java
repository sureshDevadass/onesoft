package com.onesoft.day7;

public class ToFindMax {
	public static void main(String[] args) {
		
		int[] a= {10,50,60,70,20,30,80,100};
		int max=a[0];
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println(max);
		
	}

}
