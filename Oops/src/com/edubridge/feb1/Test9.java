package com.edubridge.feb1;

/*
 * Super keyword is used only access for the parent class
 */
 
class A11{
	int x=100;
}
class B extends A11{
	
	
	
	int x=200;
	
	void show() {
		System.out.println(super.x);
	}
}
public class Test9 {


	
	public static void main(String[] args) {
		
		B b1=new B();
		System.out.println(b1.x);
		b1.show();
		
    
	}

}