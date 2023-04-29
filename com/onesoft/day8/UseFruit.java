package com.onesoft.day8;

public class UseFruit {
	public static void main(String[] args) {
		
		Fruit f=new Fruit();
		f.name="Banana";
		f.price=100;
		f.isHybrid=false;
		

		Fruit f1=new Fruit();
		f1.name="Gauva";
		f1.price=80;
		f1.isHybrid=false;
		

		Fruit f2=new Fruit();
		f2.name="Orange";
		f2.price=150;
		f2.isHybrid=true;
		

		Fruit f3=new Fruit();
		f3.name="Mango";
		f3.price=200;
		f3.isHybrid=true;
		

		Fruit f4=new Fruit();
		f4.name="Apple";
		f4.price=250;
		f4.isHybrid=false;
		
		Fruit[] fruits= {f,f1,f2,f3,f4};
		Fruit a=null;
		int max=fruits[0].price;
		for (int i = 0; i < fruits.length; i++) {
			
			if(fruits[i].price>=max)
			{
				max=fruits[i].price;
				a=fruits[i];
				
			}
			
		}
		System.out.println(a.name+","+a.price+","+a.isHybrid);
	}

}
