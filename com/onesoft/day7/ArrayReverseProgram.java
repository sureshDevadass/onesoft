package com.onesoft.day7;

public class ArrayReverseProgram {
	public static void main(String[] args)
	{
	int[] b=new int[5];
	b[0]=50;
	b[1]=40;
	b[2]=80;
	b[3]=70;
	b[4]=80;
	for(int i=b.length-1;i>=0;i--)
	{
		System.out.println(b[i]);
	}

}
}
