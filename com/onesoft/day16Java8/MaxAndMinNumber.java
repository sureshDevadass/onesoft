package com.onesoft.day16Java8;

public class MaxAndMinNumber {

	public  int maximumNumber(int a[]) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}

		}
		return max;

	}

	public static int minimumNumber(int a[]) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= min) {
				min = a[i];
			}

		}
		return min;

	}

}
