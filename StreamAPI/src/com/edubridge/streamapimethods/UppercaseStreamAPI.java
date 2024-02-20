package com.edubridge.streamapimethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseStreamAPI {

	public static void main(String[] args) {
		List<String>obj=Arrays.asList("","Om","Raj","Deep");
		String res=obj.stream().map(i->i.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(res);

	}

}
