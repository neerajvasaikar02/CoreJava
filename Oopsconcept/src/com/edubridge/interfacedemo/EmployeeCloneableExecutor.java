package com.edubridge.interfacedemo;

import java.util.Scanner;

public class EmployeeCloneableExecutor {

	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the empId:");
		int empId=s.nextInt();
		System.out.println("Enter the empName:");
		String empName=s.next();
		System.out.println("Enter the Salary:");
		long salary=s.nextLong();
		
		Employee e1=new Employee(empId,empName,salary);
		/*override clone method inside implementable class to use over */
		Employee e2=(Employee)e1.clone();
		e2.display();
	}

}
