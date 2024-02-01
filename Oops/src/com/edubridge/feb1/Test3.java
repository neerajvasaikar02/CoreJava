package com.edubridge.feb1;
/*This-refer current object
represent instance of the class when it is used
commonly it is used to access modify the fields of current object
specially when method field names and class variable are same
*/
class Student{
	String name;
	
	Student(String name){
	this.name=name;
	}
	void disp() {
		System.out.println(name);
	}
}
public class Test3 {

	public static void main(String[] args) {
		Student s1=new Student("jhon");
		s1.disp();
		
	}

}

