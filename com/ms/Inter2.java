package com.ms;

import java.util.Arrays;
import java.util.List;

public class Inter2 {
	public static void main(String[] args) {

		int arr[] = { 5, 8, 7, 4, 6 };
		Arrays.sort(arr);
		List<int[]> asList = Arrays.asList(arr);
		for(int i:arr) {
		System.out.println(i);
		}
		System.out.println("---------");
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
