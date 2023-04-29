package com.onesoft.day11;

public class UseRubber {

	public static void main(String[] args) {
		
		Rubber r=new Rubber("APSARA", 10, "White", true);
		Rubber r1=new Rubber("NATRAJ",8,"Yellow",true);
		Rubber r2=new Rubber("Camel",12,"RED",true);
		
		Rubber[] rr= {r,r1,r2};
		
		for(Rubber p:rr)
		{
				System.out.println(p);
			}
		
	}
}
