package com.onesoft.day16Java8;

public class UseChair extends Chair {

	public static void main(String[] args) {

		Chair ud = new Chair();

		System.out.println(ud.printMaterial("WOOD"));
		System.out.println(ud.printFurniture("SOFA"));
		System.out.println(Furniture.findPrice(100));
		System.out.println(Chair.findPrice(100));
	}

}