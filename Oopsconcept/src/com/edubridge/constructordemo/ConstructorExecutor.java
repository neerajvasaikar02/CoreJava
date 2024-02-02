package com.edubridge.constructordemo;

class Rectangle
{
	//instance variable
	int length;
	int breadth;
	//parameterized constructor 
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	void area() {
		System.out.println("Area of rectangle"+length*breadth);
	}
	void perimeter() {
		System.out.println("Perimeter of rectangle"+2*(length*breadth));
	}
	
	Rectangle(){
		System.out.println("Rectangle");
	}
}

public class ConstructorExecutor {

	public static void main(String[] args) {   
		Rectangle r=new Rectangle(4,5);
		r.area();
		r.perimeter();
		
		Rectangle r1=new Rectangle(5,8);
		r1.area();
		r1.perimeter();
		
		Rectangle w=new Rectangle();

	}

}
