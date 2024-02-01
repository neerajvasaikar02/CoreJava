package com.edubridge.feb1;
/*Abstract

-class as with abstract keyword
abstract class classname

-u can not create object of abstract class

-abstract is having abstract method as well as non-abstract method

-at a time u can inherit only one abstract class
- in normal class we cnat create abstract method*/
 abstract class Animal{
	
	void eat() {
		System.out.println("Animal is eating");
	}
	
	abstract void bark() ;
	
}
class  Dog extends Animal{

	@Override
	void bark() {
		System.out.println("Dog is barking");
		
	}
	
}
public class Test7 {

	public static void main(String[] args) {
	Dog d1=new Dog();
	
	d1.bark();
	d1.eat();
	}

}