package com.onesoft.day7;

public class ToCheckVowelAndCount {

	public static void main(String[] args) {

		String[] b = { "SURESH", "ONESOFT", "OMR", "CHENNAI", "PINCODE" };

		int count = 0;
		for (int i = 0; i < b.length; i++) {

			if (b[i].contains("A") || b[i].contains("E") || b[i].contains("I") || b[i].contains("O")
					|| b[i].contains("U")) {
				System.out.println(b[i]);
				count++;
			}
		}
			System.out.println("Count = " + count);

		

	}

}
