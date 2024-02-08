package com.edubridge.uncheckedexception;

import java.util.Scanner;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
				int x=15;
		System.out.println("Enter the value of y: ");
		try {
			int y=s.nextInt();
			System.out.println(x/y);
			
			//System.exit(0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Occured"+e);
			System.exit(0);
		}
		finally
		{
			//System.exit(0);
			/*when we thrown an exception inside a finally block before printing the statement*/
			System.out.println(12/0);
			System.out.println("Finally block");
		}
		s.close();
	}

}
