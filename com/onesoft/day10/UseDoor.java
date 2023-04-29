package com.onesoft.day10;

public class UseDoor {
	
	public static void main(String[] args) {
		
		Wood w1=new Wood("WOOD",5000,true);
		Wood w2=new Wood("IRON",10000,true);
		Wood w3=new Wood("STEEL",8000,true);
		Wood[] woods= {w1,w2,w3};
		for(Wood w:woods)
		{
			if(w.getPrice()>8000)
			{
			System.out.println(w);
			}
		}
	}

}
