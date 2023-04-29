package com.onesoft.day13collection;

import java.util.ArrayList;

public class UseBike {
	
	public static void main(String[] args) {
		
		Bike b1=new Bike("YAMAHA",80000,"BLACK",true);
		Bike b2=new Bike("PULSAR",90000,"WHITE",true);
		Bike b3=new Bike("APACHE",85000,"YELLOW",true);
		Bike b4=new Bike("ROYAL ENFIELD",180000,"BLACK",true);
		Bike b5=new Bike("HONDA",60000,"RED",true);
		Bike b6=new Bike("JAWA",200000,"GREEN",true);
		
		ArrayList<Bike> b=new ArrayList<>();
		
		b.add(b1);
		b.add(b2);
		b.add(b3);
		b.add(b4);
		b.add(b5);
		b.add(b6);
		
		System.out.println(b);
		
		System.out.println("\n");
		
		Bike temp=null;
		int max=b1.getPrice();
		
		for (int i = 0; i < b.size(); i++) {
			
			if(b.get(i).getPrice()>=max)
			{
				max=b.get(i).getPrice();
				temp=b.get(i);
			}
		}
		System.out.println(temp);
		
		System.out.println("\n");
		
		for (Bike bikes : b) {
			if(bikes.getBrand().contains("A")||bikes.getBrand().contains("E")||bikes.getBrand().contains("I")||bikes.getBrand().contains("O")||bikes.getBrand().contains("U"))
			{
				System.out.println(bikes);
			}
			
		}
		System.out.println("\n");
		
		b.forEach(x->{if(x.getBrand().startsWith("R")){System.out.println(x); }});
	}

	
}
