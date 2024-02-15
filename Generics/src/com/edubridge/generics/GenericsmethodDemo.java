package com.edubridge.generics;

public class GenericsmethodDemo {

	public static<E>void accept(E[] arr)
	{
		for(E itr:arr)
		{
			System.out.println(itr+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] arr1 = {11,22,33,44,55,66,77,88,99,100};
		System.out.println("First array is : ");
		GenericsmethodDemo.accept(arr1);
		
		String[] arr2 = {"Abhi","Bunty","Ram","Sham","Raj"};
		System.out.println("Second array is : ");
		GenericsmethodDemo.accept(arr2);

	}

}
