package com.onesoft.day13collection;

import java.util.ArrayList;

public class Age3 {
	
	public static void main(String[] args) {

		ArrayList<Integer> ages = new ArrayList<>();

		ages.add(28);
		ages.add(22);
		ages.add(24);
		ages.add(30);
		ages.add(33);

		ages.forEach(x->System.out.println(x));
		
		System.out.println("\n");
		ages.set(2,25);
		
		ages.forEach(x->System.out.println(x));
		
		System.out.println("\n");
		
		ages.remove(2);
		
		ages.forEach(x->System.out.println(x));
	}


}
