package com.eb.ContextProvider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextProvider {
	private static ApplicationContext context;
	 public static ApplicationContext provideContext()
	 {
		 //ClassPathXmlApplicationContext -define xml document
	 if(context==null)
	 {
	 context=new
	ClassPathXmlApplicationContext("bean.xml");
	 }
	 return context;
	 }
	
}