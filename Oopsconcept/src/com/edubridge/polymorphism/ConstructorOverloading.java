package com.edubridge.polymorphism;

class Renault
{
	String carName;
	int noOfSeater;
	String color;
	String engine;
	float price;
	
	Renault(String carName, String color, int noOfSeater)
	{
		this.carName=carName;
		this.noOfSeater=noOfSeater;
		this.color=color;
		System.out.println(carName+" "+color+" "+noOfSeater);
		
	}
	Renault(String carName, String engine, float price)
	{
		this.carName=carName;
		this.engine=engine;
		this.price=price;
		System.out.println(carName+" "+engine+" "+price);
		
	}
	
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		
	}

}
