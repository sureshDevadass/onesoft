package com.onesoft.day10;

public class UseEmployee {
	public static void main(String[] args) {
		
	PersonalDetails p=new PersonalDetails();
	p.FatherName="DEVADOSS";
	p.mobileNo=9840461955l;
	p.address="Chennai";
	
	Employee e=new Employee();
	e.employeeName="D.Suresh";
	e.designation="SOFTWARE DEVELOPER";
	e.salary=20000;
	e.personalDetails=p;
	
	System.out.println("EMPLOYEE NAME : "+e.employeeName+" "+
	                   " DESIGNATION : "+e.designation+" "+
			            " SALARY : "+e.salary  +"\n" );
	System.out.println("FATHER NAME : "+e.personalDetails.FatherName+
			             " MOBILE NO : "+e.personalDetails.mobileNo+
			             " ADDRESS : "+e.personalDetails.address);
	
	
		
		
	}
}
