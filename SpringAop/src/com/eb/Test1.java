package com.eb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");

		Swiggy t=(Swiggy)context.getBean("sw");
		
		System.out.println("Calling methods");
	
	t.staterMenu();
	
	t.vegMenu();
	
	t.nonvegMenu();
	}

}
