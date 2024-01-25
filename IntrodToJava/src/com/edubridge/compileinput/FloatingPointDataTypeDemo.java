package com.edubridge.compileinput;

import java.util.Scanner;

public class FloatingPointDataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		Scanner s = new Scanner(System.in);
	
		float x = s.nextFloat();
		double y = s.nextDouble();
		boolean z = false;
		String str = s.next();
		s.next();
		char w = s.next().charAt(0);
		
		System.out.println("The float value is"+x);
		System.out.println("The double value is"+y);
		System.out.println("The boolean value is"+z);
		System.out.println("The String value is"+str);
		System.out.println("The Char value is"+w);
		
		s.close();
		
	}

}
