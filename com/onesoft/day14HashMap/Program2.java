package com.onesoft.day14HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class Program2 {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(101,"Suresh");
		hm.put(102,"AJay");
		hm.put(103, "Dhana");
		hm.put(104,"Jeeva");
		
		for (Integer s : hm.keySet()) {
			
			System.out.println(hm.get(s));
			
		}
		System.out.println("\n");
		for (String s : hm.values()) {
			
			System.out.println(s);
			
			
		}
		System.out.println("\n");
		hm.values().forEach(x->System.out.println(x));
		System.out.println("\n");
		hm.keySet().forEach(x->System.out.println(x));
		System.out.println("\n");
		hm.forEach((x,y)->System.out.println(x+" "+y));
		
		Iterator itr=hm.values().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
