package com.edubridge.structuraldesignpattern;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
System.out.println("Welcome to Registration Service");
		
		Scanner sc=new Scanner(System.in);
		
		int choice;
		
		do {
			System.out.println("1.KFC");
			System.out.println("2.Dominos");
			System.out.println("3.Macdonalds");
			System.out.println("4.Exit");
			System.out.println("Enter choice:");
			choice=sc.nextInt();
			FranchiseRegistration f=new FranchiseRegistration();
			switch(choice) {
			
			case 1:
				f.BuyKFC();
			break;
			case 2:
				f.BuyDominos();
			break;
			case 3:
				f.BuyMacDonalds();
			break;
			case 4:
				System.out.println("Service denied");
			break;
			default:
				System.out.println("Wrong choice");
			}
		}

	while(choice!=4);

	}


	}


