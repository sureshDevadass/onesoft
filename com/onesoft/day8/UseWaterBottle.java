package com.onesoft.day8;

public class UseWaterBottle {
	public static void main(String[] args) {

		WaterBottle w = new WaterBottle();
		w.material = "CELLO";
		w.price = 100;
		w.colour = "Blue";
		w.capacity = 1;

		
		WaterBottle w1 = new WaterBottle();
		w1.material = "STAINLESS STEEL";
		w1.price = 200;
		w1.colour = "SILVER";
		w1.capacity = 1;

		WaterBottle w2 = new WaterBottle();
		w2.material = "COPPER";
		w2.price = 500;
		w2.colour = "BROWN";
		w2.capacity = 1;

		WaterBottle w3 = new WaterBottle();
		w3.material = "GLASS";
		w3.price = 300;
		w3.colour = "RED";
		w3.capacity = 3;
		
		WaterBottle w4 = new WaterBottle();
		w4.material = "PLASTIC";
		w4.price = 600;
		w4.colour = "Blue";
		w4.capacity = 2;


		WaterBottle[] bottles = { w, w1, w2, w3, w4 };
		for (int i = 0; i < bottles.length; i++) {
			
			if(bottles[i].material.equalsIgnoreCase("Plastic")) {
				
			System.out.println("Prices: " + bottles[i].price+"," + "Capacity: " + bottles[i].capacity);
			}
		}
	}
}
