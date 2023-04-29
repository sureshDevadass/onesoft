package com.onesoft.day9;

public class UseStudent {
	public static void main(String[] args) {
		
		Student s=new Student();
		s.setName("D.Suresh");
		s.setSection("A");
		s.isRegular=true;
		s.std=12;
		
		System.out.println(s.getName()+" "+s.getSection()+" "+s.isRegular+" "+s.std);
		
		
	}

}
