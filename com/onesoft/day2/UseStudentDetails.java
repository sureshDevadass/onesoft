package com.onesoft.day2;

public class UseStudentDetails {
	public static void main(String[] args) {
		
		StudentDetails s=new StudentDetails();
		s.name="Pranav";
		s.gender='M';
		s.DOB="22-11-2008";
		s.rollNo=48;
		s.std=8;
		s.section='A';
		s.place="Vandalur,Chennai";
		
		System.out.println("Name : " +s.name+" Gender : "+s.gender+" DOB : "+s.DOB+" RollNo :  "+s.rollNo+" STD : "+s.std+" Section : "+s.section+" Place :  "+s.place);
		
		StudentDetails v=new StudentDetails();
		v.name="Sabari";
		v.gender='M';
		v.DOB="02-10-2009";
		v.rollNo=58;
		v.std=8;
		v.section='C';
		v.place="Brodway,Chennai";
		
		System.out.println("Name : " +v.name+" Gender : "+v.gender+" DOB : "+v.DOB+" RollNo :  "+v.rollNo+" STD : "+v.std+" Section : "+v.section+" Place :  "+v.place);
		
		StudentDetails f=new StudentDetails();
		f.name="Lavanya";
		f.gender='F';
		f.DOB="03-12-2007";
		f.rollNo=32;
		f.std=8;
		f.section='B';
		f.place="Guindy,Chennai";
		
		System.out.println("Name : " +f.name+" Gender : "+f.gender+" DOB : "+f.DOB+" RollNo :  "+f.rollNo+" STD : "+f.std+" Section : "+f.section+" Place :  "+f.place);
		
	}

}
