package com.onesoft.day13collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseStudentDetails {
	public static void main(String[] args) {
		
		StudentDetails sd1=new StudentDetails("AJAY",25,1);
		StudentDetails sd2=new StudentDetails("JEEVA",22,12);
		StudentDetails sd3=new StudentDetails("DHANA",22,8);
		
		ArrayList<StudentDetails> student=new ArrayList<>();
		student.add(sd1);
		student.add(sd2);
		student.add(sd3);

		System.out.println("\n");
		System.out.println("----------FILTER WITH LIST--------");
		System.out.println("\n");
		
		List<StudentDetails> li=student.stream().filter(x->x.getName().startsWith("A")).collect(Collectors.toList());
		li.forEach(y->System.out.println(y));
		
		System.out.println("\n");
		System.out.println("----------FILTER WITHOUT LIST--------");
		System.out.println("\n");
		
		student.stream().filter(x->x.getName().startsWith("D")).forEach(y->System.out.println(y));
		
		System.out.println("\n");
		System.out.println("----------MAP WITH LIST--------");
		System.out.println("\n");
		
		List<Integer> stud= student.stream().map(x->x.getAge()).collect(Collectors.toList());
		System.out.println(stud);
		
		System.out.println("\n");
		System.out.println("----------MAP WITHOUT LIST--------");
		System.out.println("\n");
		
		student.stream().map(x->x.getName()).forEach(y->System.out.println(y));
		
		System.out.println("\n");
		System.out.println("----------COUNT--------");
		System.out.println("\n");
		
		Long a=student.stream().count();
		System.out.println(a);
		
		System.out.println("\n");
		System.out.println("----------FILTER & MAP WITH LIST--------");
		System.out.println("\n");
		
		List<Integer> list=student.stream().filter(x->x.getName().startsWith("A")).map(x->x.getAge()).collect(Collectors.toList());
		System.out.println(list);
		
		System.out.println("\n");
		System.out.println("----------FILTER & MAP WITHOUT LIST--------");
		System.out.println("\n");
		
		student.stream().filter(x->x.getAge()>10).map(x->x.getName()).forEach(y->System.out.println(y));
		
		System.out.println("\n");
		System.out.println("----------MAP INTERFACE --------");
		System.out.println("\n");
		
		Map<Integer,StudentDetails> mp=student.stream().filter(x->x.getAge()>10).collect(Collectors.toMap(z->z.getRollNo(),b->b));
		System.out.println(mp);
		
		
		
		
		
	}

}
