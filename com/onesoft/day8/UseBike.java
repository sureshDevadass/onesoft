package com.onesoft.day8;

public class UseBike {
	public static void main(String[] args) {
		
		Bike b=new Bike();
		b.bikeName="RoyalEnfield";
		b.registerNo=3763;
		b.isPetrol=true;
		b.colour="RED";
		
		Bike b1=new Bike();
		b1.bikeName="PULSAR";
		b1.registerNo=5353;
		b1.isPetrol=true;
		b1.colour="BLUE";
		
		Bike b2=new Bike();
		b2.bikeName="HONDA";
		b2.registerNo=3333;
		b2.isPetrol=true;
		b2.colour="WHITE";
		
		Bike b3=new Bike();
		b3.bikeName="TVS BIKE";
		b3.registerNo=7633;
		b3.isPetrol=true;
		b3.colour="BLACK";
		
		Bike b4=new Bike();
		b4.bikeName="JAWA";
		b4.registerNo=3636;
		b4.isPetrol=true;
		b4.colour="GREEN";
		
		Bike[] bike= {b,b1,b2,b3,b4};
		
		for (Bike bike2 : bike) {
         if(bike2.registerNo%2!=0)
         {
        	 System.out.println(bike2.bikeName+" "+bike2.bikeName.charAt(bike2.bikeName.length()/2));
         }
			
		}
		
		
	}

}
