package com.edubridge.list;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<Integer>obj=new LinkedList<>();
		obj.add(22);
		obj.add(7);
		obj.add(4);
		System.out.println(obj);
		
		obj.add(0, 6);
		System.out.println(obj);
		System.out.println(obj.contains(77));
		System.out.println(obj.getClass());
		
	//obj.clear();
		//System.out.println(obj);
		//System.out.println(obj.equals(obj));
		for(Integer itr:obj)
		{
			System.out.print(itr+ "  ");
		
		}
		System.out.println();
		Iterator<Integer>itr=obj.listIterator();
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
		Collections.reverse(obj);
		
		for(Object itr1:obj)
		{
			System.out.println(itr1+" ");
		}

		

	}

}
