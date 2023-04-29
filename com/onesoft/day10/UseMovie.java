package com.onesoft.day10;

public class UseMovie {
	public static void main(String[] args) {
		
		Movie m=new Movie();
		m.setTicketPrice(200);
		m.setTypeOfMovie("THIRILLLER");
		m.name="RATCHASAN";
		
		System.out.println(m.getTicketPrice()+" "+m.getTypeOfMovie()+" "+
		m.name);
	}

}
