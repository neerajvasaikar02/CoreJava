package com.edubridge.oops;
//overriding
class Animal{
	void eat() {
		System.out.println("Animal Behaviour");
	}
}
class Cat1{
	void eat() {
		System.out.println("Cat Animal Behaviour");
	}
}
class Dog1{
	void eat() {
		System.out.println("Dog Animal Behaviour");
	}
}
public class TestSeven {

	public static void main(String[] args) {
		
		Animal a1=new Animal();
		
		Cat1 c1=new Cat1();
		
		Dog1 d1=new Dog1();
		
		a1.eat();
		c1.eat();
		d1.eat();

	}

}
