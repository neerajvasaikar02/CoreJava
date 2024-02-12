package com.edubridge.list;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
	/*we cannot create a object for collection interface*/
	List<String>obj=new ArrayList<>();
	obj.add("Neeraj");
	obj.add("Durvesh");
	obj.add("Abhi");
	System.out.println(obj);
	
	List<Object>obj1=new ArrayList<>();
	obj1.add("Neeraj");
	obj1.add(100);
	obj1.add(80.9);
	System.out.println(obj1);
	
	List<String>obj2=new ArrayList<>();
	obj2.addAll(obj);
	System.out.println(obj2);
	
	obj2.remove(1);
	System.out.println(obj2);
	}

}
