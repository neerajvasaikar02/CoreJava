package com.edubridge.assignment;
import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	String str = s.next();
	for(int i=str.length();i>0;i--)
	{
		System.out.print(str.charAt(i-1));
	}
	s.close();
	}
	
}
