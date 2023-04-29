package com.onesoft.day11;

public class UseLoadProgram {
	public static void main(String[] args) {
		
		LoadProgram lp=new LoadProgram();
		System.out.println(lp.findMax(80));
		System.out.println(lp.findMax(80, 90));
		System.out.println(lp.findMax(120,150,110));
		String[] a= {"hello","welcome","java"};
		System.out.println(lp.findMax(a));
				
			
			
				
				
		}
}