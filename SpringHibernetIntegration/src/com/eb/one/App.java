package com.eb.one;

import org.springframework.context.ApplicationContext;

import com.eb.ContextProvider.ContextProvider;
import com.eb.dao.StudentDao;
import com.eb.entity.Student;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println( "Hello World!" );
		    
		    ApplicationContext ctx= ContextProvider.provideContext();
		    StudentDao studentDao=ctx.getBean("stDao",StudentDao.class);
		    // insert
		    Student ss=new Student();
		    Student s=new Student(106,"dev");   
		    studentDao.insert(s);
		    studentDao.getAllStudent();
		    System.out.println(ss.getName()+" "+ss.getId());
		    
		    //studentDao.delete(104);
		    /*studentDao.getAllStudent();
		    System.out.println(ss.getName()+" "+ss.getId());
		    Student s1=new Student();
		    s1.setName("priyaPatil");
		    s1.setId(105);
		    studentDao.update(s1);
		    studentDao.getAllStudent();
		    System.out.println(ss.getName()+" "+ss.getId());*/
		    }
		    
		
	}


