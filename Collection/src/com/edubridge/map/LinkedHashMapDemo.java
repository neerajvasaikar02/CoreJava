package com.edubridge.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String>obj=new LinkedHashMap<>();
		obj.put(1, "Raj");
		obj.put(5, "Om");
		obj.put(8, "Ria");
		obj.put(5, "null");
		System.out.println(obj);
		//to extract the elements of map
		for(Entry<Integer, String> itr:obj.entrySet())
		{
			System.out.println(itr.getKey()+" "+itr.getValue());
		}
		System.out.println();
		
	}

}
