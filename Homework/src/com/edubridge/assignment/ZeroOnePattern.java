package com.edubridge.assignment;

import java.util.Scanner;

public class ZeroOnePattern {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i;
		for (i=1;i<2*n;i=i+2)
		{
			
			for (int j=i;j<=2*n;j+=2)
			{
				System.out.print(j);
				
				
			}
			System.out.println();
			
		s.close();
		}

	}

}
