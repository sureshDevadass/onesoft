package com.onesoft.day5;

public class ToFindVowels {
	public static void main(String[] args) {

		String name = "suresh";
		if (name.contains("a") || name.contains("e") || name.contains("i") || name.contains("o")
				|| name.contains("u")) {
			System.out.println("Vowels Present");

		} else {
			System.out.println("Vowels Not Present");
		}
	}

}
