package com.edubridge.inheritance.singleinheritance;
//child class
public class Learner extends Trainer {

	public String learnerName;
	public int rollno;
	
	public void display()
	{
		super.display();
		System.out.println(learnerName+""+rollno);
	}
	
}
