package com.edubridge.oops;
/*Hiding the implementation detail and showing only essential information to user*/
abstract class Orders{
	public void show() {
		System.out.println("This is show method");
	}
}

class Demo extends Orders{
	
}
public class TestNine {

	public static void main(String[] args) {
		Demo o1=new Demo();
		
		o1.show();

	}

}
