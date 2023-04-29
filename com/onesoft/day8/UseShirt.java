package com.onesoft.day8;

public class UseShirt {
	public static void main(String[] args) {

		Shirt s = new Shirt();
		s.brand = "Levis";
		s.color = "Blue";
		s.price = 1500;
		s.isChecked = false;

		Shirt s1 = new Shirt();
		s1.brand = "Allen Solly";
		s1.color = "Red";
		s1.price = 1800;
		s1.isChecked = true;

		Shirt s2 = new Shirt();
		s2.brand = "Peter England";
		s2.color = "Blue";
		s2.price = 2000 ;
		s2.isChecked = false;

		Shirt s3 = new Shirt();
		s3.brand = "Raymond";
		s3.color = "YELLOW";
		s3.price = 1600;
		s3.isChecked = false;

		Shirt s4 = new Shirt();
		s4.brand = "ARROW";
		s4.color = "BROWN";
		s4.price = 2500;
		s4.isChecked = false;
		
		Shirt[] sh= {s,s1,s2,s3,s4};
		
		for(int i=0;i<sh.length;i++)
		{
			if(sh[i].isChecked==true)
			{
				System.out.println("Net Price:"+(sh[i].price-(sh[i].price*5/100)));
			}
			
		}
		

	}

}
