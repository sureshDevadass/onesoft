package com.onesoft.day11;

public class Developer extends Employee {
	
	public String language(String language)
	{
		return language;
	}
	public void toCheckLanguage(String language)
	{
		if (language.equalsIgnoreCase("java")) {
			System.out.println("Highly Preferable");
		} else if (language.equalsIgnoreCase("Python")) {
			System.out.println("Developing Java");
		} else {
			System.out.println("Not Required");
		}

	}

}
