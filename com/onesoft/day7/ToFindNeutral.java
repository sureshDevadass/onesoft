package com.onesoft.day7;

public class ToFindNeutral {
	public static void main(String[] args) {
		
		int[] a= {-1,0,1,2,-2,3};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==0)
			{
				System.out.println(a[i]);
				count++;
			}
				
			
		}
		System.out.println("Count ="+count);
	
	}

}
