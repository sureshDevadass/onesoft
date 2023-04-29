package com.onesoft.day12;

public class UseBank {

	public static void main(String[] args) {
		
		CUBBank c=new CUBBank();
		System.out.println(c.accNum(1245784512l));
		System.out.println(c.pinNum(4578));
		System.out.println(c.name("Suresh"));
		System.out.println(
				c.isActive(true));
		}
}
