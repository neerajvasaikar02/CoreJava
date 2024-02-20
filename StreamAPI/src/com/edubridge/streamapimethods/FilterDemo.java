package com.edubridge.streamapimethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		//first way to use stream
	List<String>obj=Arrays.asList("Raj","Om","Deeptid");
	obj.stream().filter(i->i.length()>5).forEach(i->System.out.println(i));

	Stream<Integer>obj1=Stream.of(11,4,67,89);
	System.out.println(obj1.count());
	
	//limit
	obj.stream().limit(2).forEach(i->System.out.print(i+" "));
	System.out.println();
	
	//skip
	obj.stream().skip(1).forEach(i->System.out.println(i+" "));
	
}
} 
