package com.edubridge.stringtokenizerdemo;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		StringTokenizer t=new StringTokenizer("" + "Hey there, wassup bro");
		System.out.println(t.countTokens());
		System.out.println(t.nextToken());
		StringTokenizer t1=new StringTokenizer("");
		t1=new StringTokenizer("Edu-Bridge-India","-",true);
		while (t1.hasMoreTokens()) 
		System.out.println(t1.nextToken());
		
	}

}
