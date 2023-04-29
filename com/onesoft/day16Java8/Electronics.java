package com.onesoft.day16Java8;

public interface Electronics {

	public static void onOff(boolean isOn)
	{
		if(isOn==true)
		{
			System.out.println("Working");
		}
		else
		{
			System.out.println("Not Working");
		}
	}
	void print();
	
	
}
