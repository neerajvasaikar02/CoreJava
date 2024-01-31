package com.edubridge.oops;
//parent class
class Dog{
	String color="black";
}

class Cat extends Dog{
	String color1="white";
}

public class TestOne {

	public static void main(String[] args) {
		//subclass,childclass,derived
		//Dog d1=new Dog();  //since we haveextends Dog
		Cat c1=new Cat();
		System.out.println("Dog color is:"+c1.color+"\nCat color is:"+c1.color1);
	}

}
