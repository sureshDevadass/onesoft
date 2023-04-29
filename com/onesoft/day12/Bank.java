package com.onesoft.day12;

public abstract class Bank {

	abstract long accNum(long num);

	abstract int pinNum(int pin);

	public String name(String name) {
		return name;
	}

	public boolean isActive(boolean isActive) {
		return isActive;
	}

}
