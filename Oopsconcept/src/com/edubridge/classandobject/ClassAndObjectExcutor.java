package com.edubridge.classandobject;
/*program to demonstrate on class and object*/
class Vegetables
{
	//variable or fields
	String vegetableName;
	int price;
	
	//methods
	void print()
	{
		System.out.println("Vegetable name: "+vegetableName+" "+"price is:"+price);
	}
}

//driver class
public class ClassAndObjectExcutor {

	public static void main(String[] args) {
		Vegetables v=new Vegetables();
		v.vegetableName="JackFruit";
		v.price=80;
		v.print();

	}

}
