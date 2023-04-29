package com.onesoft.day16Java8;

import java.util.Optional;

public class Nullpoi {
	public void getName(String nameS) {
		
	}

	public static void main(String[] args) {

		String a = null;

		// System.out.println(a.length());
		Optional<String> check = Optional.ofNullable(a);

//		System.out.println(check.isPresent());
//		
//		System.out.println(check.isEmpty()); 
//		
		if (check.isPresent() == true) {
			System.out.println(a.length());
		} else {
			System.out.println("The value is null");
		}
		System.out.println(check.orElse("The value is not present"));

		
	}
}
