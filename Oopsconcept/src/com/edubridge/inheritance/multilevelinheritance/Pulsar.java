package com.edubridge.inheritance.multilevelinheritance;
class Pulsar {
	public int speed;
	public int price;

	
public Pulsar(int speed, int price) {
		super();
		this.speed = speed;
		this.price = price;
	
	}


@Override
public String toString() {
	return "Pulsar [speed=" + speed + ", price=" + price + "]";
}

}
