package com.onesoft.day12;

public abstract class College implements Education {

	public void findstaffName(String name) {

		System.out.println(name);

	}

	public String findIdNo(int no) {
		if (no % 2 == 0) {
			return "Even Number";
		} else {
			return "Odd Number";
		}
	}
}
