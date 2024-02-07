package com.edubridge.interfacedemo;
//driver class
public class InterfaceExecutor {

	public static void main(String[] args) {
		/*we can't create an object in interface*/
		//Cafe c=new Cafe();
		TheVibe t=new TheVibe();
		t.showMenu();
		t.displayPrice();
	}
}
