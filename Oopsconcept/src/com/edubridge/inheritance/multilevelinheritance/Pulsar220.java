package com.edubridge.inheritance.multilevelinheritance;

public class Pulsar220 extends Pulsar180{
	public int speed;
	public int price;
	public Pulsar220(int speed, int price) {
		super(speed,price);
		this.speed = speed;
		this.price = price;
		super.speed=60;
		super.price=120000;
	}
	@Override
	public String toString() {
		return "Pulsar220 [speed=" + speed + ", price=" + price + ", toString()=" + super.toString() + "]";
	}
	
	
	


}
