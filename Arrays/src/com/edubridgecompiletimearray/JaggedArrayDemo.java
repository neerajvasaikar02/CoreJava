package com.edubridgecompiletimearray;
import java.util.Scanner;
public class JaggedArrayDemo {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	/*array declaration for jagged array for an outside array*/

	int arr[][]=new int[2][];
	arr[0]=new int[3];
	arr[1]=new int[2];
	//System.out.println("Enter ");
	//for storing an array elements
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			arr[i][j]=s.nextInt();
		}
	}
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
	}
}
