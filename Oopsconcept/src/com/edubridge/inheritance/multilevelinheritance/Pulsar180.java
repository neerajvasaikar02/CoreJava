package com.edubridge.inheritance.multilevelinheritance;

public class Pulsar180 extends Pulsar{
	
	public int speed;
	public int price;

	public Pulsar180(int speed, int price) {
		super(speed, price);
		this.speed = speed;
		this.price = price;
		
		super.speed=56;
		super.price=123456;
	}

	@Override
	public String toString() {
		return "Pulsar180 [speed=" + speed + ", price=" + price + ", toString()=" + super.toString() + "]";
	}
	
	 

}
