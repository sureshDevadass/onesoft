package com.onesoft.day15Exception;

import java.util.Iterator;

public class ArrayInDexEx {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(a[i]);
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Invalid");
		}
	}

}
