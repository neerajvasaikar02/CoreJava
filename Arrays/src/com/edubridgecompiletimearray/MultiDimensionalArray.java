package com.edubridgecompiletimearray;

import java.util.Scanner;

/*progam to demonstate on Multidmensional array*/
public class MultiDimensionalArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		//two-d array declaration
		int arr[][] =new int[m][n];
		//storing the array element
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
	}

	}
}
