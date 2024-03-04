package com.edubridge.designpattern;

import java.util.Scanner;

public class TestTwo {

	public static void main(String[] args) {
		SelectNetworkPlan s2=new SelectNetworkPlan();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the network for which you want");
		String networkName=sc.next();
		
		System.out.println("enter the number of minutes :");
		
		int min=sc.nextInt();
		
		CellularPlan p=s2.getPlan(networkName);
		
		System.out.println("Bill amount for"+networkName+"of "+min);
		
		p.getRate();
		
		p.processBill(min);

	}

}
