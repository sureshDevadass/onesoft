package com.onesoft.day14HashMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseCricket {

	public static void main(String[] args) {

		Cricket c1 = new Cricket("Dhoni", 40, 80, 0, true);
		Cricket c2 = new Cricket("Suresh Raina", 38, 70, 0, true);
		Cricket c3 = new Cricket("Ashwin", 37, 20, 3, false);
		Cricket c4 = new Cricket("Dhana", 25, 30, 1, false);
		Cricket c5 = new Cricket("Ajay", 26, 32, 1, false);

		ArrayList<Cricket> sB = new ArrayList<>();

		sB.add(c1);
		sB.add(c2);
		sB.add(c3);
		sB.add(c4);
		sB.add(c5);

		System.out.println("\n");
		System.out.println("-------NAME STARTSWITH D -----------");
		System.out.println("\n");

		List<Cricket> lc = sB.stream().filter(x -> x.getName().startsWith("D")).collect(Collectors.toList());

		for (Cricket c : lc) {
			System.out.println(c);
		}
		System.out.println("\n");
		System.out.println("------MAXIMUM RUN------------------");
		System.out.println("\n");
		int max = 0;
		String temp = "";
		List<Cricket> lc1 = sB.stream().filter(x -> x.getRun() >= 10).collect(Collectors.toList());

		for (Cricket c : lc1) {
			if (c.getRun() > max) {
				max = c.getRun();
				temp = c.getName();
			}
		}
		System.out.println(max);
		System.out.println(temp);
		System.out.println("\n");
		System.out.println("-------AGE ABOVE 32-------------------");
		System.out.println("\n");

		List<Cricket> age = sB.stream().filter(x -> x.getAge() > 32).collect(Collectors.toList());

		age.forEach(x -> System.out.println(x.getName() + " " + x.getAge()));
		System.out.println("\n");
		System.out.println("------------FOR EACH-----------------");
		System.out.println("\n");

		sB.stream().filter(x -> x.getAge() > 18).forEach(y -> System.out.println(y));
		System.out.println("\n");
		System.out.println("------------USING COUNT-----------------");
		System.out.println("\n");

		System.out.println(sB.stream().count());
		
		Long a=sB.stream().count();
		System.out.println("Total Players:"+a);
		System.out.println("\n");
		System.out.println("------------USING MAP-----------------");
		System.out.println("\n");
		
		List<Boolean> li=sB.stream().map(x->x.getRun()>=25).collect(Collectors.toList());
		
		li.forEach(x->System.out.println(x));
		
		List<Integer> lis=sB.stream().map(x->x.getRun()).collect(Collectors.toList());
		lis.forEach(x->System.out.println(x));
 
		sB.stream().map(x->x.getName().charAt(x.getName().length()/2)).forEach(y->System.out.println(y));
		
		System.out.println("\n");
		System.out.println("------------USING MAP AND FILTER-----------------");
		System.out.println("\n");
		
		sB.stream().filter(x->x.getAge()>30&x.getRun()>30).map(t->t.getName()).forEach(y->System.out.println(y));
		
		List<String>ll=sB.stream().filter(x->x.getAge()>30&x.getRun()>30).map(t->t.getName()).collect(Collectors.toList());
		
		ll.forEach(x->System.out.println(x));
		
		System.out.println("\n");
		System.out.println("------------USING MAP INTERFACE-----------------");
		System.out.println("\n");
		
		
		Map<Integer,Cricket> mp=sB.stream().filter(x->x.getName().startsWith("D")).collect(Collectors.toMap(y->y.getAge(),z->z));
		System.out.println(mp);
		System.out.println("--------------");
		
		Map<String,Cricket> mpp=sB.stream().filter(x->x.getName().startsWith("A")).collect(Collectors.toMap(z->z.getName(), b->b));
		System.out.println(mpp);
		
	}

}
