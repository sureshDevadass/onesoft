package com.onesoft.day2test;

public class UseAccountHolder {
	public static void main(String[] args) {

		AccountHolder ac = new AccountHolder();

		ac.name = "mano";
		ac.age = 26;
		ac.gender = "Male";
		ac.accountNumber = 28330485612583l;
		ac.monthlyIncome = 21000;
		ac.savingsPercentage = 18 / 100f;

		System.out.println("NAME : " + ac.name + " Savings Amount : " + ac.monthlyIncome * ac.savingsPercentage);

		AccountHolder ac1 = new AccountHolder();
		ac1.name = "savithri";
		ac1.age = 25;
		ac1.gender = "Female";
		ac1.accountNumber = 28330485612584l;
		ac1.monthlyIncome = 20000;
		ac1.savingsPercentage = 20 / 100f;

		System.out.println("NAME : " + ac1.name + " Savings Amount : " + ac1.monthlyIncome * ac1.savingsPercentage);

		AccountHolder ac2 = new AccountHolder();

		ac2.name = "kamban";
		ac2.age = 30;
		ac2.gender = "Male";
		ac2.accountNumber = 28330485612585l;
		ac2.monthlyIncome = 30000;
		ac2.savingsPercentage = 10 / 100f;

		System.out.println("NAME : " + ac2.name + " Savings Amount : " + ac2.monthlyIncome * ac2.savingsPercentage);

	}

}
