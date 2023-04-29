package com.onesoft.day12;

public abstract class Employee {

	//String name;
	//int id;
	//int salaryPerHour;
	//int workingHour;

	// Implemented Method
	public String getWork(String work) {
		return work;
	}

	// unImplemented Method
	public abstract int calculatePerDaySalary(int salaryPerHour, int workinghour);

}
