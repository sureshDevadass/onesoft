package com.onesoft.day11;

public class UseDeveloper {
	public static void main(String[] args) {

		Developer d = new Developer();
		System.out.println(d.name("Suresh"));
		System.out.println(d.workExperience(3));
		int age = d.age(30);
		String language = d.language("Java");
		d.toCheckLanguage(language);
		d.toCheckRetirement(age);

			}

}
