package com.onesoft.day16Java8;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter Name:");
		 System.out.println(sc.next());
		 System.out.println("Enter Age:"); 
		 System.out.println(sc.nextInt());
		 System.out.println("Address:");
		 System.out.println(sc.nextLine());
	}

}
