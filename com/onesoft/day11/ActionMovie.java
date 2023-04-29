package com.onesoft.day11;

public class ActionMovie extends Movie {
	public String findSong(int noOfSong) {
		if (noOfSong == 5) {
			return "Average";
		} else if (noOfSong == 4) {
			return "Okay";
		} else if (noOfSong == 3) {
			return "Good";
		} else {
			return "Very Good";
		}

	}
}
