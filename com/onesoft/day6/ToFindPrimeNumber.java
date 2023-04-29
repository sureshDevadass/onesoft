package com.onesoft.day6;

public class ToFindPrimeNumber {
	public static void main(String[] args) {
		
		int num=6;
		
		boolean isPrime=true;
		
		for(int i=2;i<num;i++) {
			
			if(num%2==0) {
				
				isPrime=false;
			}
		}
		if(isPrime==true) {
			System.out.println(num+" is a Prime Number");
		}
		else
		{
			System.out.println(num+" is not a Prime Number");
		}
	}

}
