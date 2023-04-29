package com.onesoft.day14HashMap;

public class Employee {
	
	public Employee(String name, String gender, int empId, int age, int salary) {
		super();
		this.name = name;
		this.gender = gender;
		this.empId = empId;
		this.age = age;
		this.salary = salary;
	}
	private String name;
	private String gender;
	private int empId;
	private int age;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", empId=" + empId + ", age=" + age + ", salary="
				+ salary + "]";
	}

}
