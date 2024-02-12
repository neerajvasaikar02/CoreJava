package com.edubridge.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Object>s=new Stack<>();
		s.add("Neeraj");
		s.add(15);
		s.add('b');
		System.out.println(s.lastElement());
		s.push(66.0);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		

	}

}
