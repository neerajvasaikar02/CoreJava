package com.edubridge.assignment;

import java.util.Scanner;

public class SeriesTwo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int res=6;
		int i;
		for(i=1;i<=n;i++)
		{
			System.out.println(res+" ");
			res+=5*i;
			
		}

		s.close();

	}

}
