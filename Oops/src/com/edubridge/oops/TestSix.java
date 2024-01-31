package com.edubridge.oops;

/*overloading(compile time/static)
 * method have same with different parameters*/
class Calculation
{
	void add(String a, String b) {
		System.out.println("addition is:"+(a+b));
	}
	void add(int a, int b) {
		System.out.println("Addition is:"+(a+b));
	}
	void add(int a, int b, int c) {
		System.out.println("Addition is:"+(a+b+c));
	}
}
public class TestSix {

	public static void main(String[] args) {
	
		Calculation c2=new Calculation();
		
		c2.add(10,20);
		c2.add("Helo","World");
		c2.add(10,20,30);

	
	}

}
