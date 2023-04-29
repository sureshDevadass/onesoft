package com.onesoft.day16Java8;

public class UseCalculate {

	public static void main(String[] args) {

		Calculate add = (num1, num2) -> num1 + num2;
		System.out.println(add.find(100, 200));
		Calculate sub = (num1, num2) -> num1 - num2;
		System.out.println(add.find(300, 100));
		Calculate.print();
		System.out.println(sub.type());
		Calculate mul=(num1,num2)->num1*num2;
		System.out.println(mul.find(20, 30));
		Calculate div=(num1,num2)->num1/num2;
		System.out.println(div.find(200, 100));
		

	}

}
