package com.edubridge.menudrivenapp;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Management System");
		
		int choice=0;
		
		do {
			System.out.println("1.Employee has to Enter Name");
			System.out.println("2.Employee has to Enter Designation");
			System.out.println("3.Employee has to Enter Specialization");
			System.out.println("4.Exit");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter name:");
				
				String name=sc.next();
				System.out.println("Employee Name"+ name);
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
		}
			while(choice !=4);

				
	}
}
