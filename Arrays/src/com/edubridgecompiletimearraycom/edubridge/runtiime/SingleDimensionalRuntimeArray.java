package com.edubridgecompiletimearraycom.edubridge.runtiime;

import java.util.Scanner;

public class SingleDimensionalRuntimeArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//array declaration
		int arr[]=new int[n];
		//to initialize an array elements
		for(int i=0;i<n;i++)
		{
			//to store array elements
			arr[i]=s.nextInt();
		}
		{System.out.println("Array elements are: ");
		//to print array elements
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+"");
		}
		s.close();
	}
		
	}
}
