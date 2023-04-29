package com.onesoft.day14HashMap;

public class Students {

	public Students(String name, int regNo, String gender, int std, char section,int age) {
		super();
		this.name = name;
		this.regNo = regNo;
		this.gender = gender;
		this.std = std;
		this.section = section;
		this.age=age;
	}
	private String name;
	private int regNo;
	private String gender;
	private int std;
	private char section;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Students [name=" + name + ", regNo=" + regNo + ", gender=" + gender + ", std=" + std + ", section="
				+ section + ", age=" + age + "]";
	}
	
		
	
}
