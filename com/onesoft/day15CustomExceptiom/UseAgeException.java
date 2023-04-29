package com.onesoft.day15CustomExceptiom;

public class UseAgeException extends Exception {

	public static void main(String[] args) {
		
		try
		{
			int age=17;
			if(age>=18)
			{
				System.out.println("Eligible");
			}
			else
			{
				throw new AgeException("Not Eligible for Vote");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}

}
