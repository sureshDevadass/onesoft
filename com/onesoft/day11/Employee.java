package com.onesoft.day11;

public class Employee {
	
	public String name(String name)
	{
		return name;
	}
	public int workExperience(int workExperience)
	{
		return workExperience;
	}
	
	public int age(int age)
	{
		return age;
	}
	public void toCheckRetirement(int age)
	{

		if (age > 50) {
			System.out.println("Eligible");

		} else {
			System.out.println("Not Eligible");
		}

	}

}
