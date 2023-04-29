package com.onesoft.day16Java8;

public class UseArray {

	public static void main(String[] args) {

		int a[] = { 10, 20, 50, 30, 60 };

		// System.out.println(MaxAndMinNumber.maximumNumber(a));
		System.out.println(MaxAndMinNumber.minimumNumber(a));

		MaxAndMinNumber mm = new MaxAndMinNumber();

		MaxAndMin max = mm::maximumNumber;
		System.out.println(max.find(a));

		MaxAndMin min = MaxAndMinNumber::minimumNumber;
		System.out.println(min.find(a));

	}
}
