package com.onesoft.day2test;

public class UseEmployee {
	public static void main(String[] args) {

		Employee e = new Employee();
		e.employeeId = 87548;
		e.employeeName = "Suresh";
		e.dateOfBirth = "22-04-1989";
		e.mobileNo = 7845437017l;

		System.out.println("Employee ID : " + e.employeeId + " Employee Name : " + e.employeeName + " Date Of Birth : "
				+ e.dateOfBirth + " Mobile No : " + "+91" + e.mobileNo);

		Employee e1 = new Employee();
		e1.employeeId = 78457;
		e1.employeeName = "Rajesh";
		e1.dateOfBirth = "25-04-2001";
		e1.mobileNo = 9840431955l;

		System.out.println("Employee ID : " + e1.employeeId + " Employee Name : " + e1.employeeName
				+ " Date Of Birth : " + e1.dateOfBirth + " Mobile No : " + "+91" + e1.mobileNo);

	}

}
