package com.edubridge.stringdemo;

import java.util.Arrays;

public class StringMethodsDemo {

	public static void main(String[] args) {
		String str1="Nia Sharma";
		String str2= " ";
		System.out.println(str1.length());
		//to convert string into character array
		char []arr=new char[10];
		str1.getChars(0, 10, arr, 0);
		System.out.println(Arrays.toString(arr));
		System.out.println(str1.compareTo("nia shaRmas"));
		System.out.println(str1.compareToIgnoreCase("nia shaRmaa"));
		System.out.println(str2.isEmpty());//true
		System.out.println(str2.isBlank());
		System.out.println(str1.charAt(4));
		System.out.println("Hey Guy's you are awesome".startsWith("He"));
		System.out.println("Hey Guy's you are awesome".endsWith("som"));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(" The Neeraj Vasaikar ".trim());
		System.out.println(" The Neeraj Vasaikar ".repeat(2));

	}

}
 