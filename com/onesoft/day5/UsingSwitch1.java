package com.onesoft.day5;

public class UsingSwitch1 {

	public static void main(String[] args) {

		String s = "Pune";
		switch (s) {
		case "Manager":
			System.out.println("Allowed to Cashier Room");
		case "Pune":
			System.out.println("Allowed to manger room");
		case "Cashier":
			System.out.println("Allowed to cash Table");
		case "staff":
			System.out.println("Allowed to cabin");
		case "Citizens":
			System.out.println("Allowed to Reception");
		}
	}

}
