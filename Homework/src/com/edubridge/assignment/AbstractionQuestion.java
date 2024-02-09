package com.edubridge.assignment;

abstract class Vehicle {
	abstract void startEngine();
	abstract void stopEngine();
}
class Car extends Vehicle{
	void startEngine() {
		System.out.println("Car Engine is Started");
	}
		void stopEngine() {
			System.out.println("car Engine has Stopped");
		}
	}
class Motorcycle extends Vehicle{
	void startEngine() {
		System.out.println("Motorcycle Engine is Stopped");
	}
	void stopEngine() {
		System.out.println("Motorcycle Engine has Stopped");
	}
}
public class AbstractionQuestion{
	public static void main(String[]args) {
		
		Motorcycle m=new Motorcycle();
		Car c=new Car();
		c.startEngine();
		c.stopEngine();
		m.startEngine();
		m.stopEngine();
	}

		
	}
