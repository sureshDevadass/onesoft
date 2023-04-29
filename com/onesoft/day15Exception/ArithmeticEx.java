package com.onesoft.day15Exception;

public class ArithmeticEx {
	
	public static void main(String[] args) {
		
		try {
			int a=15;
			int b=0;
			System.out.println(a);
			int div=a/b;
			System.out.println(div);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
			System.out.println("Invalid");
		}
	}

}
