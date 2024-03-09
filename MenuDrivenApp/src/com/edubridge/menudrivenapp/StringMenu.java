package com.edubridge.menudrivenapp;

import java.util.Scanner;

public class StringMenu {

	public static void main(String[] args) {
		System.out.println("Welcome to String Management System");
		String stc1;
		String stc2;
		int choice=0;
		do {
			System.out.println("1.String Length :");
			System.out.println("2.Concatination :");
			System.out.println("3.Compare 10 :");
			System.out.println("4.Exit :");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter choice");
			choice=sc.nextInt();
		
			switch(choice) {
			case 1:
				System.out.println("String Length:");
				
				stc1 =sc.next();
				System.out.println("Enter ");
				stc2 =sc.next();
				System.out.println("String Length 1: "+ stc1.length());
			break;
			case 2:
				System.out.println("Enter designation");
				
				String designation=sc.next();
				System.out.println("Employee Designation"+ designation);
			break;
			case 3:
				System.out.println("Enter specialization");
				
				String specialization=sc.next();
				System.out.println("Employee Specialization"+ specialization);
			break;
			case 4:
				System.out.println("Enter exit");
				
				
			break;
			default:
				System.out.println("Wrong Input");
			break;
			}
		}while(choice>=5);
	
	}
	}
		
	


			
		
	


