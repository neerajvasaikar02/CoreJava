package com.edubridge.uncheckedexception;

import java.util.Scanner;

public class CatchBlockDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=45;
		System.out.println("Enter the value of y");
		int y=s.nextInt();
		int arr[]= {12,5,7};
		try {
			System.out.println(x/y);
			
		}
			catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
				System.out.println(e);
		}
		try
		{
			System.out.println(arr[3]);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Always Executed");
		}
		s.close();

	}



	}


