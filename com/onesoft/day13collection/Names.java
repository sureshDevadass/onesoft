package com.onesoft.day13collection;

import java.util.ArrayList;

public class Names {
	
	public static void main(String[] args) {
		
		ArrayList<String> name=new ArrayList<>();
		
		name.add("Suresh");
		name.add("Dhana");
		name.add("Ajay");
		name.add("Jeeva");
		
		System.out.println(name);
		
		for (int i = 0; i < name.size(); i++) {
			
			System.out.println(name.get(i));
			
		}
		System.out.println("\n");
		name.add("OneSoft");
		
		for (String n : name) {
			
			System.out.println(n);
			
		}
		System.out.println("\n");
		
		name.set(4,"OneSoftTechnologies");
		
		name.forEach(n->System.out.println(n));
		
	}

}
