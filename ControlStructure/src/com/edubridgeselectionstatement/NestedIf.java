package com.edubridgeselectionstatement;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age and weight of a person:");
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>12)
		{
			if((weight>45 && weight<=110) || weight>=110)
			{
				System.out.println("eligible for bunjeee jumping. if weight is greater then 110 the additional roots are added");
			}
			else
			{
				System.out.println("the person is not eligible ");
			}
		}
		else
		{
			System.out.println("the person is not eligible ");

		}	
	}
}
