package com.edubridge.oops;
class A{
	void methodA() {
		System.out.println("This is class A method");
	}
}
class B extends A{
	void methodB() {
		System.out.println("This is class B method");
	}
	
}
class C extends B{
	void methodC() {
		System.out.println("This is class C method");
    }
}
public class TestTwo {

	public static void main(String[] args) {
		C c1=new C();
		
		c1.methodA();
		c1.methodB();
		c1.methodC();

	}

}
