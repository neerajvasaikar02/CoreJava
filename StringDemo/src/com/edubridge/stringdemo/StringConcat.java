package com.edubridge.stringdemo;

import java.util.Scanner;

public class StringConcat {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=new String(s.next());
		System.out.println(str1.concat(str2));
		System.out.println(220+50+"Hello"+80+60);
		System.out.println(20+"Hello"+80);

	}

}
