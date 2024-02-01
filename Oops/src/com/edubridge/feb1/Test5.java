package com.edubridge.feb1;

class A{
	A(){
		System.out.println("This is defaulter constructor for classA");
	}
	A(int i){
		this();
		System.out.println(i);
	}
}
public class Test5 {

	public static void main(String[] args) {
		
		A a=new A(10);

	}

}
