package com.edubridge.streamapimethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveAllEmptyStringDemo {

	public static void main(String[] args) {
		List<String>obj=Arrays.asList("","Om","Raj","Deep");
		//to remove all the empty strings
		List<String> res=obj.stream().filter(i->i.isEmpty()).collect(Collectors.toList());
		System.out.println(res);

	}

}
