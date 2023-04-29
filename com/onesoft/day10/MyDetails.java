package com.onesoft.day10;

public class MyDetails {

	private String name;
	private int age;
	private String maritalStatus;
	private int weight;

	public MyDetails(String name, int age) {

		this.name = name;
		this.age = age;
	
	}

	@Override
	public String toString() {
		return "MyDetails [name=" + name + ", age=" + age + ", maritalStatus=" + maritalStatus + ", weight=" + weight
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
