package com.onesoft.day9;

public class Factorial {
	int temp = 1;

	public int fact(int a) {

		for (int i = a; i >= 1; i--) {
			temp = temp * i;

		}
		return temp;

	}

}
