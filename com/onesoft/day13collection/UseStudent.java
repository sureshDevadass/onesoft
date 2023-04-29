package com.onesoft.day13collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UseStudent {
	
	public static void main(String[] args) {
		
		Student s1=new Student("MAGESH","MALE",80,30);
		Student s2=new Student("RAJESH","MALE",70,25);
		Student s3=new Student("SURENDHAR","MALE",60,25);
		Student s4=new Student("PRADEEP","MALE",85,35);
		Student s5=new Student("MADHU","FEMALE",50,20);
		Student s6=new Student("VIDHYA","FEMALE",55,30);
		Student s7=new Student("MANOJ","MALE",90,30);
		
		ArrayList<Student>s=new ArrayList<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		s.add(s6);
		s.add(s6);
		s.add(s7);
		
		System.out.println(s);
		
		System.out.println("\n");
		
		List<Student> collect = s.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());
		System.out.println("-----------------");
		List<Student> collect1 = s.stream().sorted(Comparator.comparing(x->x.getAge())).collect(Collectors.toList());
		for(Student ss:collect1) {
				System.out.println(ss);
		}
		System.out.println("----------------");
		s.forEach(x->{if(x.getGender().equalsIgnoreCase("MALE")) {System.out.println(x);}});
		
		System.out.println("\n");
		ArrayList<Student>maleList=new ArrayList<>();
		for(Student ss:s)
		{
			if(ss.getGender().equalsIgnoreCase("male"))
			{
				maleList.add(ss);
			}
		}
		
	maleList.forEach(y->System.out.println(y));
	}

}
