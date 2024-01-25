package com.edubridgeselectionstatement;
import java.util.Scanner;
public class CascadeIfElse {

	public static void main(String[] args) {
		
		// Checking how is heavier
		
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is heavier");
		}
		else if (b>a && b>c)
		{
			System.out.println("b is heavier");
			
		}
		else 
		{
			System.out.println("c is heavier");
		}
		s.close();
	}
	}
