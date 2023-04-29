package com.onesoft.day15Exception;

public class NumberFormatExc {
	public static void main(String[] args) {
		
		try {
			String s="Suresh";
		  int a=Integer.parseInt(s);
		  System.out.println(a);
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Invalid");
		}
	}

}
