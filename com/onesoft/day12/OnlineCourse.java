package com.onesoft.day12;

public class OnlineCourse implements Course{

	
	public void courseLink(String url) {
		
		System.out.println(url);
		
		
	}

	
	public void CourseTrainerName(String name) {
	
		System.out.println(name);
	}


	public void courseFees(String courseName) {
		
		if(courseName.equalsIgnoreCase("Java"))
		{
			System.out.println("Fees is : 20000");
		}
		else if(courseName.equalsIgnoreCase("Python"))
		{
			System.out.println("Fees is : 15000");
		}
		else if(courseName.equalsIgnoreCase("SQL"))
		{
			System.out.println("Fees is : 10000");
		}
		else
		{
			
			System.out.println("Course is not available");
		}
		
	}

	public void courseHours(int hours) {
		
		System.out.println(hours+" : Hours ");
		
	}

}
