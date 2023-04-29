package com.onesoft.day13collection;

import java.util.ArrayList;


public class Age1 {

	public static void main(String[] args) {

		ArrayList<Integer> ages = new ArrayList<>();

		ages.add(28);
		ages.add(22);
		ages.add(24);
		ages.add(25);
		ages.add(33);

		for (int i = 0; i < ages.size(); i++) {

			System.out.println(ages.get(i));

		}

	}
}
