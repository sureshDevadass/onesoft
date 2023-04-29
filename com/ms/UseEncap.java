package com.ms;

public class UseEncap extends Encap {
	String designation;
	int salary;
	
	@Override
	public String toString() {
		return "designation=" + designation + ", salary=" + salary +super.toString();
	}

	public UseEncap(String name, String address, String designation, int salary) {
		super(name, address);
		this.designation = designation;
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		UseEncap u=new UseEncap("Suresh", "Chennai", "Admin",30000);
		System.out.println(u);
		
	}

}
