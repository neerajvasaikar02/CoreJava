package com.edubridge.assignment;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int flag =0;//0//false
	System.out.println("Array element:");
	int arr[] = new int[n];
	for(int i=0;i<n;i++)
	{
		arr[1] = s.nextInt();
	}
	System.out.println("element to find ");
	int a = s.nextInt();
	//LOGIC
	for(int i=0 ; i<n ; i++)
	{
		if(arr[i]==a)
			flag=1;
		
	}

	if(flag==1) {
		System.out.println("the number " +a + "is found");}
	else {
		System.out.println("thenumber" +a + "not found");}
	}

}
