package com.edubridge.map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		SortedMap<String,Float>obj=new TreeMap<>();
		obj.put("Shifa", 56.8f);
		obj.put("Sakshi", 90.3f);
		obj.put("Saniya", 78.1f);
		for(Map.Entry<String,Float> itr:obj.entrySet())
		{
			System.out.println(itr.getKey()+" "+itr.getValue());
		}
		

	}

}
