package com.onesoft.day8;

public class UseStudent {
	public static void main(String[] args) {
		
		Student s=new Student();
		s.name="Rajesh".toUpperCase();
		s.rollNo=58;
		s.initial='D';
		s.adhaarNo=5845658945782145l;
		s.weight=80;
		
		Student s1=new Student();
		s1.name="gopi".toUpperCase();
		s1.rollNo=28;
		s1.initial='M';
		s1.adhaarNo=2555658945782145l;
		s1.weight=90;
		
		
		Student s2=new Student();
		s2.name="mahesh".toUpperCase();
		s2.rollNo=35;
		s2.initial='S';
		s2.adhaarNo=29565658945782145l;
		s2.weight=60;
		
		Student s3=new Student();
		s3.name="srinath".toUpperCase();
		s3.rollNo=55;
		s3.initial='G';
		s3.adhaarNo=457858945782145l;
		s3.weight=70;
		
		Student s4=new Student();
		s4.name="saravanan".toUpperCase();
		s4.rollNo=50;
		s4.initial='A';
		s4.adhaarNo=78845658945782145l;
		s4.weight=65;
		
		Student[] students= {s,s1,s2,s3,s4};
		
		for (int i = 0; i < students.length; i++) {
			
			if(students[i].name.contains("A")||students[i].name.contains("E")||
					students[i].name.contains("I")||students[i].name.contains("O")||students[i].name.contains("U"))
			{
				System.out.println(students[i].name+","+students[i].initial+","+students[i].rollNo+
						","+students[i].adhaarNo+","+students[i].weight);
			}
			
			}
			
		}
				
		
	}
	
	
