package com.edubridge.abstractclassdemo;

import java.util.Scanner;

public class AbstractClassExecutor {

	public static void main(String[] args) {
		
		ISRO i=new ISRO();
		Scanner s=new Scanner(System.in);
		System.out.println(i.display());
		i.displayDetails();
		//i.setAgencyName("ISRO");
		//i.setBudget(567890);
		i.displayDetails(s.next(), s.nextLong());
s.close();
	}

}
