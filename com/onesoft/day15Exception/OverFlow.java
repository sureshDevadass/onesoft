package com.onesoft.day15Exception;

public class OverFlow {
	
	public void findA() {
	
		findB();
	}
	public void findB() {
		
		findB();
	}
	public static void main(String[] args) {
		
		OverFlow of=new OverFlow();
		of.findB();
	}
}
