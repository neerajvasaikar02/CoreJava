package com.edubridge.feb1;

class Employee{
	String empName;
	int age;
	
	Employee(){
		System.out.println("This is default constructor");
	}
	Employee(String empName,int age){
		empName=empName;
		age=age;
		System.out.println(empName+" "+age);
	}
}
public class Test1 {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee("jhon",22);

	}

}
