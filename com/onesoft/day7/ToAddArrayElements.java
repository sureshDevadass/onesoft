package com.onesoft.day7;

public class ToAddArrayElements {
	public static void main(String[] args) {

		int[] a = { 10, 50, 60, 70, 80, 90, 100 };

		int temp = 0;

		for (int i = 0; i < a.length; i++) {

			temp = temp + a[i];

		}
		System.out.println(temp);

	}

}
