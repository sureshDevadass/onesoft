package com.onesoft.day10;

public class Compressor {
	
	private String type;
	private int capacity;
	private boolean isInvertorType;
	
	public void setType(String type)
	{
		this.type=type;
	}
	public void setCapacity(int capacity)
	{
		this.capacity=capacity;
	}
	public void setIsInvertorType(Boolean isInvertorType)
	{
		this.isInvertorType=isInvertorType;
	}
	public String getType()
	{
		return type;
	}
	public int getCapacity()
	{
		return capacity;
	}
	public boolean getIsInvertorType()
	{
		return isInvertorType;
	}

}
