package com.onesoft.day2test;

public class UseStudentDetails {
	public static void main(String[] args) {

		StudentDetails s = new StudentDetails();
		s.studentName = "Suresh";
		s.studentAge=12;
		s.studentMobileNo=7845437017l;
		s.classSection='A';
		s.marksPercentage=70;
		
		System.out.println("Name : "+s.studentName+" Student Age : "+s.studentAge+" Student MobileNo : "+s.studentMobileNo+" Class Section : "+s.classSection+" MarksPercentage : "+s.marksPercentage);
		
		

		StudentDetails s1 = new StudentDetails();
		s1.studentName = "Rajesh";
		s1.studentAge=13;
		s1.studentMobileNo=7845437018l;
		s1.classSection='B';
		s1.marksPercentage=72;
		
		System.out.println("Name : "+s1.studentName+" Student Age : "+s1.studentAge+" Student MobileNo : "+s1.studentMobileNo+" Class Section : "+s1.classSection+" MarksPercentage : "+s1.marksPercentage);
		

		StudentDetails s2 = new StudentDetails();
		s2.studentName = "Vignesh";
		s2.studentAge=15;
		s2.studentMobileNo=874575918l;
		s2.classSection='A';
		s2.marksPercentage=65;
		
		System.out.println("Name : "+s2.studentName+" Student Age : "+s2.studentAge+" Student MobileNo : "+s2.studentMobileNo+" Class Section : "+s2.classSection+" MarksPercentage : "+s2.marksPercentage);
		
	}
}
