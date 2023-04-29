package com.onesoft.day7;

public class ToPrintReverse {
	public static void main(String[] args) {
		
		int[] arg=new int[8];
		arg[0]=100;
		arg[1]=250;
		arg[2]=300;
		arg[3]=350;
		arg[4]=400;
		arg[5]=450;
		arg[6]=500;
		arg[7]=550;
		for (int i = arg.length-1; i >= 0; i--) {
			System.out.println(arg[i]);
			
		}
		}

}
