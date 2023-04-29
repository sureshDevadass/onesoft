package com.onesoft.day14HashMap;

import java.util.HashMap;

public class Program {
	public static void main(String[] args) {
		
		HashMap<String,Long> phoneBook=new HashMap<String,Long>();
		phoneBook.put("Suresh",7845437017l);
		phoneBook.put("Ajay",7545437017l);
		phoneBook.put("Dhana",7645437017l);
		phoneBook.put("Jeeva",7945437017l);    	
		phoneBook.put("Kamal",7345437017l);  
		
		System.out.println(phoneBook);
		System.out.println(phoneBook.get("Ajay"));
	}

}
