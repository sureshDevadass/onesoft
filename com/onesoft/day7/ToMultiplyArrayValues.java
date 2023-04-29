package com.onesoft.day7;

public class ToMultiplyArrayValues {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int temp = 1;
		for (int i = 0; i < a.length; i++){
			temp = temp * a[i];
		}
		System.out.println(temp);
	}

}
