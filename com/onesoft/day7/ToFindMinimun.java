package com.onesoft.day7;

public class ToFindMinimun {

	public static void main(String[] args) {
		String[] s = { "SURESH", "ONESOFT", "TRAINING CENTRE" };
		int min = s[0].length();
		String m = s[0];

		for (int i = 0; i < s.length; i++) {

			if (s[i].length() < min) {
				min = s[i].length();
				m = s[i];

			}
		}
 
		System.out.println(min);
		System.out.println(m);

	}

}
