package com.onesoft.day5;

public class UsingElseIf {
	
	public static void main(String[] args)
	{
		int mark=36;
		
		if(mark>0&&mark<35)
		{
			System.out.println("FAIL");
		}
		else if(mark>=35&&mark<=50)
		{
			System.out.println("C GRADE");
		}
		else if(mark>50&&mark<=70)
		{
			System.out.println("B GRADE");
		}
		else if(mark>70&&mark<=90)
		{
			System.out.println("A GRADE");
		}
		else if(mark>90&&mark<=100)
		{
			System.out.println("S GRADE");
		}
	}

}
