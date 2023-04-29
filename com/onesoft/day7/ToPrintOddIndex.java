package com.onesoft.day7;

public class ToPrintOddIndex {
	public static void main(String[] args) {
		
		int[] b=new int[10];
		b[0]=80;
		b[1]=60;
		b[2]=40;
		b[3]=20;
		b[4]=10;
		b[5]=80;
		b[6]=90;
		b[7]=100;
		b[8]=120;
		b[9]=140;
		for(int i=1;i<b.length;i=i+2)
		{
			System.out.println(b[i]);
		}
	}

}
