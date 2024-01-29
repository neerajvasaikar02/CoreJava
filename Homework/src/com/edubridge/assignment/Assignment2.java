package com.edubridge.assignment;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char w =s.next().charAt(0);
		System.out.printf("Unicode value of '%c' is : %d\n",w,(int)w);
		s.close();	
		}

	}

