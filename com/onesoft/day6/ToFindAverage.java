package com.onesoft.day6;

public class ToFindAverage {
	public static void main(String[] args) {

		int temp = 0;
		int count = 0;

		for (int i = 1; i <= 5; i++) {

			temp = temp + i;
			count++;

		}
		System.out.println(temp / count);
	}

}
