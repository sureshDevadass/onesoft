package com.onesoft.day9;

public class UseCat {
	public static void main(String[] args) {
		
		Cat c=new Cat("RotWeiler","Black");
		c.age=1;
		c.isSmall=true;
		
		
		System.out.println(c.breedName+" "+c.color+" "+c.age+" "+c.isSmall+" ");
	}

}
