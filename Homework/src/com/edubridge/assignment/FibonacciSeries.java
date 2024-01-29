package com.edubridge.assignment;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=0,b=1,c;
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.printf(c+" ");
		}
		System.out.println();

	}

}
