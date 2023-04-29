package com.ms;

public class Encap {
	
	private String name;
	private  String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Encap [name=" + name + ", address=" + address + "]";
	}
	public Encap(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	

}
