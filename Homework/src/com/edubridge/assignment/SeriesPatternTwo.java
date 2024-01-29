package com.edubridge.assignment;

import java.util.Scanner;

public class SeriesPatternTwo {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	int n=s.nextInt();
	int z=5;
	int a=6;
	for(int i=0;i<n;i++) {
		a+=5*i;
		System.out.println(a);
	}
	
	}

}
