package com.onesoft.day14HashMap;

import java.util.HashMap;

public class Program3 {

	public static void main(String[] args) {

		HashMap<String, Long> phoneBook = new HashMap<String, Long>();
		phoneBook.put("Suresh", 7845437017l);
		phoneBook.put("Ajay", 7545437017l);
		phoneBook.put("Dhana", 7645437017l);
		phoneBook.put("Jeeva", 7945437017l);
		phoneBook.put("Kamal", 7345437017l);

		for (String s : phoneBook.keySet()) {
			if (s.startsWith("K")) {
				System.out.println(phoneBook.get(s));
			}
		}
		long max = 0;
		for (Long l : phoneBook.values()) {
			if (l >= max) {
				max = l;
			}

		}
		System.out.println(max);
	}

}
