package com.onesoft.day12;

public class SmartPhone implements Phone {

	public void voiceCall() {

		System.out.println("Voice Call Feature Available ");

	}

	public void videoCall() {

		System.out.println("Video Call Feature Availabale");

	}

	public void connectivity() {

		System.out.println("Connectivity Feature Available");

	}

	public void cameraFunction(String tapping) {

		switch (tapping) {
		case "Single Tapping":
			System.out.println("Taking Picture");
			break;

		case "Double Tapping":

			System.out.println("Zooming");
			break;

		case "Continous Tap-ping":
			System.out.println("Continuos Shots");
			break;
			
		default:
			System.out.println("Invalid");

		}

	}

}
