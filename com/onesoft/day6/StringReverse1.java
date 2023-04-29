package com.onesoft.day6;

public class StringReverse1 {

	public static void main(String[] args) {

		String s = "Suresh";
		String temp = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			
			temp = temp + s.charAt(i);

		}
		System.out.println(temp);

	}

}
