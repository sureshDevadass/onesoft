package com.onesoft.day2test;

public class UseStudent {
	public static void main(String[] args) {
		
		Student s=new Student();
		
		s.name="siva";
		s.id=234;
		s.age=14;
		s.std="IX";
		s.attendancePercentage=75/100f;
		
		Student s1=new Student();
		
		s1.name="mari";
		s1.id=236;
		s1.age=15;
		s1.std="X";
		s1.attendancePercentage=80/100f;
		
		Student s2=new Student();
		
		s2.name="Valli";
		s2.id=237;
		s2.age=13;
		s2.std="VIII";
		s2.attendancePercentage=90/100f;
		
		System.out.println("Name : " + s.name +","+ " No Of Days Present in School : " + s.attendancePercentage*240+" days");
		System.out.println("Name : " + s1.name +","+ " No Of Days Present in School : " + s1.attendancePercentage*240+" days");
	    System.out.println("Name : " + s2.name +","+ " No Of Days Present in School : " + s2.attendancePercentage*240+" days");
	}
}
