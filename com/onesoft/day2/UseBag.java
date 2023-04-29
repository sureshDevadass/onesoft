package com.onesoft.day2;

public class UseBag {

	public static void main(String[] args) {
		
		Bag b=new Bag();
		b.brand="WILDCRAFT";
		b.color="Black";
		b.price=1500;
		b.noOfZipsAvailable=4;
		b.isLaptopSpaceAvailable=true;
		b.size="Medium";
		System.out.println(b.brand+" "+b.color+" "+b.price+" "+b.noOfZipsAvailable+" "+b.isLaptopSpaceAvailable+" "+b.size);
	}
}
