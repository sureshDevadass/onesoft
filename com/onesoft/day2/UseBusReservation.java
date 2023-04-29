package com.onesoft.day2;

public class UseBusReservation {
	
	public static void main(String[] args) {
		
		BusReservation b=new BusReservation();
		b.name="Suresh";
		b.gender='M';
		b.age=30;
		b.date="01-03-2023";
		b.time="8.45pm";
		b.boardingPlace="Perungalthur";
		b.destinationPlace="Coimbatore";
		b.busRegistrationNumber="TN-11-R-3763";
		b.isAcAvailable=true;
		
		System.out.println("Name : " +b.name+" Gender : "+b.gender+" Age : "+b.age+" Date : "+b.date+" Time : "+b.time+" Boarding Place : "+b.boardingPlace+"Destination Place : "+b.destinationPlace+"AC AVAILABLE : "+b.isAcAvailable+"Registration No : "+b.busRegistrationNumber);
		
	}

}
