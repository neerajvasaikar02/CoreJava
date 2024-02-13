package com.edubridge.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		/*HashMap keys are arrange in ascending order wise and hashtable keys are arrange in descending order wise*/
		Map<Integer,String>obj=new Hashtable<>();
		obj.put(5, "Om");
		obj.put(8, "Ria");
		obj.put(5, "null");
		/*we can't use key and value as 'null' else we will get an null pointer exception*/
		System.out.println(obj);
	}

}
