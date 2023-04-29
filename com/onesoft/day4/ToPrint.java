package com.onesoft.day4;

public class ToPrint {
	public static void main(String[] args) {
		
		String s=args[0];
		String s1=args[1];
		String s2=args[2];
		String s3=args[3];
		String s4=args[4];
		
		char c = s1.charAt(0);
		
		
		int i = Integer.parseInt(s2);
		
		boolean b = Boolean.parseBoolean(s3);
		
		long l = Long.parseLong(s4);
		
		System.out.println("Name : "+s+ " Initial : "+c+" LMS ID :"+i+" "+b+" "+l);
		
		
	}

}
