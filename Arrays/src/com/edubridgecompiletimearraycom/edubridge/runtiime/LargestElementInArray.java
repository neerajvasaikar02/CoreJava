package com.edubridgecompiletimearraycom.edubridge.runtiime;

import java.util.Scanner;

public class LargestElementInArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}	
		}
		System.out.println("Largest element: "+max);
		s.close();

	}

}
