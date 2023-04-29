package com.onesoft.day10;

public class UseDuster {
	public static void main(String[] args) {
		
		Duster d=new Duster("N1",50,"BLACK",true);
		Duster d1=new Duster("N2",60,"WHITE",true);
		Duster d2=new Duster("N3",50,"GREEN",true);
		 
		Duster[] dusters= {d,d1,d2};
		for(Duster du:dusters)
		{
			System.out.println("BRAND : "+du.brand+"\n"+
		                        "COLOR : "+du.color+"\n"+
					             "PRICE : "+du.price+"\n"+"IS WOOD :"+du.isWood);
		System.out.println("\n");
		}
	    
	}

}
