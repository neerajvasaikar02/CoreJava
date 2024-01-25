package com.edubridgeselectionstatement;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		if(a!=5)
		{
			System.out.println("a is not equal to b");
		}
		else
		{
			System.out.println("a is equal to b");
		}
	}

}
