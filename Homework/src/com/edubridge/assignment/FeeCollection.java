package com.edubridge.assignment;

import java.util.Scanner;

public class FeeCollection {

	private static final int BF = 0;

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		double FeeAmount=0;
		System.out.println("Enter Student Tyoe");
		String StudentType=s.next();
		System.out.println("Enter Tuition Fee");
		float tf=s.nextFloat();
		System.out.println("Enter Bus Fee");
		float bf=s.nextFloat();
		System.out.println("Enter HostelFee");
		float hf=s.nextFloat();
		
		switch(StudentType)
		{
			case "MSDS":
				FeeAmount=tf+bf;
				System.out.printf("%.2f",FeeAmount);
				break;
			case"MSH":
				FeeAmount= tf+hf;
				System.out.printf("%.2f",FeeAmount);
				break;
			case "MGSDS":
				FeeAmount=1.5*tf+bf;
				System.out.printf("%.2f",FeeAmount);
				 break;
			 default :
				 System.out.println("Invalid");
					 
		}
		
		}
		
	



	}

