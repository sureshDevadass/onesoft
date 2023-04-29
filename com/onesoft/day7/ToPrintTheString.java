package com.onesoft.day7;

public class ToPrintTheString {

	public static void main(String[] args) {
		
		String s[]= {"ONESOFT","TRAINING CENTRE","OMR","SURESH"};
		
		for(int i=0;i<s.length;i++){
			if(s[i].length()>=6)
			{
				System.out.println(s[i]);
			}
			
		}
	}
}
