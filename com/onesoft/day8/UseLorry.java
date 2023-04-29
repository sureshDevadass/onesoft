package com.onesoft.day8;

public class UseLorry {

	public static void main(String[] args) {

		Lorry l = new Lorry();
		l.brand = "Ashok Leyland";
		l.price = 1800000;
		l.noOfWheel = 12;
		l.isNationalTBoard = true;

		Lorry l1 = new Lorry();
		l1.brand = "BENZ";
		l1.price = 2200000;
		l1.noOfWheel = 16;
		l1.isNationalTBoard = true;

		Lorry l2 = new Lorry();
		l2.brand = "TATA";
		l2.price = 1400000;
		l2.noOfWheel = 10; 
		l2.isNationalTBoard = true;

		Lorry l3 = new Lorry();
		l3.brand = "EICHER";
		l3.price = 1400000;
		l3.noOfWheel = 10;
		l3.isNationalTBoard = true;

		Lorry l4 = new Lorry();
		l4.brand = "FORCE";
		l4.price = 1900000;
		l4.noOfWheel = 18;
		l4.isNationalTBoard = true;

		Lorry[] lorrys = { l, l1, l2, l3, l4 };

		for (int i = 0; i < lorrys.length; i++) {
//			System.out.println(lorrys[i]);//prints the object memory address
			System.out.println(lorrys[i].brand+","+lorrys[i].price+","+lorrys[i].noOfWheel+","+lorrys[i].isNationalTBoard);
		}
	}

}
