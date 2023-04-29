package com.onesoft.day14HashMap;

import java.util.HashMap;

public class UseEmployee {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee("Madhavan","Male",101,50,20000);
		Employee e2=new Employee("Balaji","Male",102,40,30000);
		Employee e3=new Employee("Selvi","FeMale",103,45,50000);
		Employee e4=new Employee("Raghavan","Male",104,35,40000);
		Employee e5=new Employee("Karthika","FeMale",105,47,60000);
		
		HashMap<Integer,Employee> list=new HashMap<>();
		
		list.put(e1.getEmpId(), e1);
		list.put(e2.getEmpId(), e2);
		list.put(e3.getEmpId(), e3);
		list.put(e4.getEmpId(), e4);
		list.put(e5.getEmpId(), e5);
		
		for(Integer x:list.keySet())
		{
			System.out.println(x);
		}
		System.out.println("\n");
		
		for(Employee x: list.values())
		{
			System.out.println(x);
		}
		
		
	}

}
