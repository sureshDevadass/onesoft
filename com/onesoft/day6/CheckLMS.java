package com.onesoft.day6;

public class CheckLMS {
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int add=0;
		for(int i=0;i<=num;i++) {
			add=add+i;
			System.out.println(i);
		}
		System.out.println(add);
		
		
		
		System.out.println(" ");
		
		for(int i=num;i>=0;i--) {
			System.out.println(i);
		}
	}

}
