package com.edubridge.oops;

public class BasicOops {
	int empId=101;
	int empAge=21;
	String empName="Neeraj";
	
	void Test() {
		System.out.println("Trying test");
	}
	public static void main(String[] args) {
		BasicOops e1=new BasicOops();
		System.out.println(e1.empAge+""+e1.empId+""+e1.empName);
		
		e1.Test();

	}

}
