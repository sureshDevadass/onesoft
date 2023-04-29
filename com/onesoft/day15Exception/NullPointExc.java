package com.onesoft.day15Exception;

public class NullPointExc {
	
	public static void main(String[] args) {
		
		try {
			String s=null;
			int b=s.length();
			System.out.println(b);
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Invalid");
		}
	}

}
