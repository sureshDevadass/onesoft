package com.onesoft.day11;

public class LoadProgram {
	
	public String findMax(int a)
	{
		if(a>100)
		{
			return a+" is greater";
		}
		else {
			return a+" is lesser";
		}
	}
	public String findMax(int a,int b)
	{
		if(a>b)
		{
			return a+" is greater";
		}
		else {
			return b+" is greater";
		}
	}
	public String findMax(int a,int b,int c)
	{
		if(a>b&&a>c)
		{
			return a+" is higher";
		}
		else if(b>a&&b>c) {
			return b+" is greater";
		}
		else
		{
			return c+" is greater";
		}
	}
	public String findMax(String[] a) {
		int max=a[0].length();
		String temp=" ";
		for (int i = 0; i < a.length; i++) {
			
			if(a[i].length()>max) {
				max=a[i].length();
				temp=a[i];
			}
		}
		return temp;
	}



}
