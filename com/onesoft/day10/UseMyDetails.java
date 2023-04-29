package com.onesoft.day10;

public class UseMyDetails {
	
	public static void main(String[] args) {
		
		MyDetails m=new MyDetails("Suresh",30);
		MyDetails m1=new MyDetails("Rajesh",25);
		MyDetails m2=new MyDetails("Vikram",28);
		
		m.setMaritalStatus("MARRIED");
		m1.setMaritalStatus("UNMARRIED");
		m2.setMaritalStatus("MARRIED");
		m.setWeight(80);
		m2.setWeight(70);
		m1.setWeight(65);
		
		
//		MyDetails[] details= {m,m1,m2};
//		
//		for (MyDetails d : details) {
//			
//			if(d.getName().startsWith("S"))
//			{
//				System.out.println(d);
//			}
//		}
		
	}

}
