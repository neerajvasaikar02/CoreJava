package com.edubridge.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsAdvantagesDemo {

	public static void main(String[] args) {
		//1. Type-Safety
		List obj = new ArrayList<>();
		//It ensure that to add only string value
		//3. Compile time checking
		//obj.add(11);
		obj.add("Neeraj");
		System.out.println(obj.get(0));
		
		//2. Type casting is not required
		//List obj2 = new ArrayList<>();
		List<String> obj1 = new ArrayList<>();
		obj1.add("Neeraj Vasaikar");
		obj1.add("Raj");
		
		String ss = obj1.get(1);
		System.out.println(ss);
		
		
		

	}

}
