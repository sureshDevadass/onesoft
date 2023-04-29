package com.onesoft.day4;

public class ToFindAverage {
	public static void main(String[] args) {
		
		String s=args[0];
		String[] sp=s.split(",");
		
		int i = Integer.parseInt(sp[0]);
		int i1 = Integer.parseInt(sp[1]);
		int i2 = Integer.parseInt(sp[2]);
		int i3 = Integer.parseInt(sp[3]);
		int i4 = Integer.parseInt(sp[4]);
		
		System.out.println((i+i1+i2+i3+i4)/5f);
		
		
	}

}
