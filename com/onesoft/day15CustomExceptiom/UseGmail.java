package com.onesoft.day15CustomExceptiom;

public class UseGmail {

	public static void main(String[] args) {
		
		String s="Suresh@.com";
		
		try {
			if(s.endsWith("@gmail.com"))
			{
				System.out.println("Successful");
			}
			else
			{
				throw new GmailCreation("Required @ gmail.com");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
