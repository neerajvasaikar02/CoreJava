package com.eb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new AnnotationConfigApplicationContext("com.eb");
		
		Info i1=context.getBean(Info.class);
		i1.disp("jhon smith");
	}
}
