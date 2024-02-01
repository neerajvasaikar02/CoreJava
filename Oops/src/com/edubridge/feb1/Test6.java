package com.edubridge.feb1;

class A1{
	A1(){
		System.out.println("This is default constructor");
	}
	A1(int x){
		this();
		System.out.println(x);
	}
	A1(int x,int y){
		this(10);
		System.out.println(x+" "+y);
	}
}
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A1 a1=new A1(100,200);
	}

}