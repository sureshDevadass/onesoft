package com.onesoft.day5;

public class UsingSwitch {
	public static void main(String[] args) {
		String day = "Monday";
		switch (day) {
 		case "Monday":
			System.out.println("First Day of the Week");
			break;
 
		case "Tuesday":
			System.out.println("Second Day of the Week");
			break;
		case "Wednesday":
			System.out.println("Third day of the Week");
			break;

		case "Thursday":
			System.out.println("Fourth day of the Week");
			break;

		case "Friday":
			System.out.println("Fifth day of the Week");
			break;

		case "Saturday":
			System.out.println("Sixth day of the week");
			break;

		default:
			System.out.println("Sunday is Last Day of the week");

		}

	}
}