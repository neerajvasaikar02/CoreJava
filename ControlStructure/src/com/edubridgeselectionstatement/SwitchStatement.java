package com.edubridgeselectionstatement;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int map_no=s.nextInt();
		switch(map_no) {
		case 1:
			System.out.println("Welcometo Erangel");
			break;
		case 2:
			System.out.println("Welcome to Miramar");
			break;
		case 3:
			System.out.println("Welcome to Sanhok");
			break;
		case 4:
			System.out.println("Welcome to Vikendi");
			break;
			default:
				System.out.println("nvalid map no");
		}

	}

}
