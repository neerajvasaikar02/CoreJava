package com.edubridge.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String>obj=new HashMap<>();
		obj.put(1, "Raj");
		obj.put(5, "Om");
		obj.put(8, "Ria");
		obj.put(5, "Veer");
		System.out.println(obj);
		System.out.println(obj.containsKey(8));
		System.out.println(obj.remove(5));
		/*it removes entire entries of key*/
		obj.remove(1, "Om");
		System.out.println(obj);
	}

}
