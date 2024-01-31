package com.edubridge.oops;

class Shape{
	
	void draw() {
		System.out.println("Draw the Shape");
	}
}
class Rectangle extends Shape{
	void area(int l,int b) {
		System.out.println("Area of rect"+(l*b));
	}
}

class Square extends Rectangle{
	int a=10;
	void sarea() {
		System.out.println(a*a);
	}
}
public class TestThree {

	public static void main(String[] args) {
		Square s=new Square();
		
		s.sarea();
		s.area(10, 20);
		s.draw();

	}

}
