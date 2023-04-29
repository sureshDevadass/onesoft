package com.ms;

public class UsePrgramming extends Programming {
	
	
	public static void main(String[] args) {
		UsePrgramming p=new UsePrgramming();
		p.display();p.show();
	}

	@Override
	public void show() {
		System.out.println("show");
	}

	@Override
	public void display() {
	System.out.println("display");	
	}
}
