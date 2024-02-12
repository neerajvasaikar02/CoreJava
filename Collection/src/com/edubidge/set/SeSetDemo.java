package com.edubidge.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SeSetDemo {

	public static void main(String[] args) {
		Set<String>obj=new HashSet<>();
		obj.add("Atul");
		obj.add("Arya");
		obj.add("Ajit");
		obj.add("Anuj");
		System.out.println(obj);
		
		Set<String>obj1=new LinkedHashSet<>();
		obj1.add("Atul");
		obj1.add("Arya");
		obj1.add("Ajit");
		obj1.add("Anuj");
		System.out.println(obj1);
		
		SortedSet<String>obj2=new TreeSet<>();
		obj2.add("Atul");
		obj2.add("Arya");
		obj2.add("Ajit");
		obj2.add("Anuj");
		System.out.println(obj2);
		
	}

}
