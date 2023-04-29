package com.onesoft.day14HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class UseStudentDetails {

	// hashcode(key)&(n-1)
	// 16 buckets open

	public static void main(String[] args) {
		Students s1 = new Students("Suresh", 4578, "Male", 10, 'A', 15);
		Students s2 = new Students("Ajay", 4579, "Male", 10, 'A', 16);
		Students s3 = new Students("Jeeva", 4580, "Male", 10, 'B', 17);
		Students s4 = new Students("Dhana", 4590, "Male", 10, 'C', 16);
		Students s5 = new Students("Madhu", 4591, "Male", 10, 'A', 15);
		Students s6 = new Students("Rajesh", 4581, "Male", 10, 'E', 15);
		Students s7 = new Students("Vignesh", 4582, "Male", 10, 'A', 16);
		Students s8 = new Students("Kamala", 4583, "FeMale", 10, 'D', 15);
		Students s9 = new Students("Manoon", 4584, "Male", 10, 'A', 16);
		Students s10 = new Students("Balaji", 4592, "Male", 10, 'A', 17);

		HashMap<Integer, Students> student = new HashMap<>();
		student.put(s1.getRegNo(), s1);	
		student.put(s2.getRegNo(), s2);
		student.put(s3.getRegNo(), s3);
		student.put(s4.getRegNo(), s4);
		student.put(s5.getRegNo(), s5);
		student.put(s6.getRegNo(), s6);
		student.put(s7.getRegNo(), s7);
		student.put(s8.getRegNo(), s8);
		student.put(s9.getRegNo(), s9);
		student.put(s10.getRegNo(), s10);
		
		Iterator<Students> itr=student.values().iterator();
		while(itr.hasNext()) {
			if(itr.next().getGender().equalsIgnoreCase("female")) {
				itr.remove();
			}	
		}
		
		student.values().forEach(x-> System.out.println(x));

//		for (Integer rollNo : student.keySet()) {
//			System.out.println(rollNo);
//		}
//		System.out.println("\n");
//		for (Students s : student.values()) {
//			if(s.getGender().equalsIgnoreCase("male")) {
//			student.remove(s.getRegNo());
//			}
//		}
//		System.out.println("After Removing Male");
//		System.out.println(student);
//		System.out.println("\n");
//		Iterator<Students> itr = student.values().iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		System.out.println("\n");
//		student.values().forEach(s -> System.out.println(s));
//		System.out.println("\n");
//		student.keySet().forEach(x -> System.out.println(x));
//
//		System.out.println("\n");
//		ArrayList<Students> male = new ArrayList<>();
//		ArrayList<Students> female = new ArrayList<>();
//
//		for (Students s : student.values()) {
//			if (s.getGender().equalsIgnoreCase("male")) {
//				male.add(s);
//			} else {
//				female.add(s);
//			}
//
//		}
//		for (Students x : male) {
//			System.out.println(x);
//		}
//		System.out.println("\n");
//		for (Students x : female) {
//			System.out.println(x);
//		}
//
//		System.out.println("\n");
//		ArrayList<Students> sec = new ArrayList<>();
//		for (Students x : student.values()) {
//			if (x.getSection() == 'A') {
//				System.out.println(x);
//
//			}
//		}
//		System.out.println("\n");
//
//		System.out.println(student.hashCode());
//
//		System.out.println("\n");
//
//		int max = 0;
//		for (Students x : student.values()) {
//			if (x.getAge() >= max) {
//				max = x.getAge();
//			}
//
//			
//		}
//		System.out.println(max);
	}

}
