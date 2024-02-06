package com.edubridge.thiskeyworddemo;

public class ThisKeywordDemo2 {

	
	void printOne(ThisKeywordDemo2 d)
		{
			System.out.println("Welcome to" + "EduBridge");
		}
	void printTwo()
		{
			//method call
			printOne(this);
		}
	public static void main(String[] args) {
		ThisKeywordDemo2 d=new ThisKeywordDemo2();
		d.printTwo();
		
	}

}
