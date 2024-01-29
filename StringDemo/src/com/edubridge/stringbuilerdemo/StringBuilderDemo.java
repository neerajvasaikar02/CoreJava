package com.edubridge.stringbuilerdemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder b=new StringBuilder("Neeraj is" + " good boy");
		//System.out.println(b);
		System.out.println(b.capacity());
		System.out.println(b.append(" of College"));
		System.out.println(b.capacity());

	}

}
