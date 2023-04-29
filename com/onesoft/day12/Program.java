package com.onesoft.day12;

public class Program extends Employee {
	
	public int calculatePerDaySalary(int salaryPerHour,int workingHour)
	{
		int salaryPerDay=salaryPerHour*workingHour;
		return salaryPerDay;
		
	}

}
