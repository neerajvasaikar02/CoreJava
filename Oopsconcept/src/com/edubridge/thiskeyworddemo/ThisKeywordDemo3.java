package com.edubridge.thiskeyworddemo;
/*this keyword is used to invoke current instance*/
public class ThisKeywordDemo3 {
	public int x;
	ThisKeywordDemo3()
	{
		/*this keyword is calling to parameterized constructor*/
	
		this(12);
		System.out.println("non-Parameterized");
	}
	ThisKeywordDemo3 (int x)
	{	
	System.out.println("parameterized Constructor");
	}
	public static void main(String[] args) {
		ThisKeywordDemo3 t=new ThisKeywordDemo3 ();
	}
}