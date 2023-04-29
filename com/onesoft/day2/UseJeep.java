package com.onesoft.day2;

public class UseJeep {
	public static void main(String[] args) {
		
		Jeep j=new Jeep();
		j.name="Jeep";
		j.variant="ZX";
		j.fuelType="PETROL";
		j.color="WHITE";
		j.exShowRoomPrice=850000;
		j.tax=50000;
		int OnRoadPrice=j.exShowRoomPrice+j.tax;
		System.out.println("Car Name : " +j.name+" Price : "+OnRoadPrice);
	}

}
