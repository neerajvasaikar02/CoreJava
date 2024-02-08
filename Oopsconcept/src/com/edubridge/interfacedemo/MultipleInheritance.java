package com.edubridge.interfacedemo;

import java.util.Scanner;

public class MultipleInheritance {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Boruto b=new Boruto();
		System.out.println("Enter an input");
		int noofchildren=s.nextInt();
		String position=s.next();
		String clan=s.next();
		b.power(noofchildren, position);
		b.powerOne(noofchildren, clan);
		System.out.println(b);
		s.close();
	}

}
