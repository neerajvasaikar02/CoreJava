package com.eb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		/*Swiggy t=(Swiggy)context.getBean("sw");
		
		System.out.println("Calling methods");
		
		t.starterMenu();
	
		
		t.vegMenu();
		t.nonVegMenu();*/
		
		Course cc=(Course)context.getBean("c1");
		
		cc.getCid();
		cc.getCname();
	
	}

	}


