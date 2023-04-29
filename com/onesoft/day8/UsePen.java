package com.onesoft.day8;

public class UsePen {
	
	public static void main(String[] args) {
		
		Pen p=new Pen();
		p.brand="Reynolds";
		p.isColor=true;
		p.isInkType="Blue";
		p.price=10;
		
		Pen p1=new Pen();
		p1.brand="CELLO";
		p1.isColor=true;
		p1.isInkType="BLACK";
		p1.price=5;
		
		Pen p2=new Pen();
		p2.brand="HERO";
		p2.isColor=true;
		p2.isInkType="RED";
		p2.price=30;
		
		Pen p3=new Pen();
		p3.brand="MARKER";
		p3.isColor=true;
		p3.isInkType="GREEN";
		p3.price=50;
		
		Pen p4=new Pen();
		p4.brand="PARKER";
		p4.isColor=true;
		p4.isInkType="Blue";
		p4.price=80;
		
		Pen[] pens= {p,p1,p2,p3,p4};
        
		for (Pen penn : pens) {
			
			if(penn.isInkType=="Blue")
			{
				System.out.println("NetPrice:"+(penn.price+(penn.price*10/100)));
			}
		}		
	}
}
