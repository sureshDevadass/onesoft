package com.onesoft.day13collection;

public class Student {
	
	
	private String name;
	private String gender;
	private int weight;
	private int age;
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
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Student(String name, String gender, int weight, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.weight = weight;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", weight=" + weight + ", age=" + age + "]";
	}
	

}
