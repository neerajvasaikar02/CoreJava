package com.edubridge.streamapimethods;

import java.util.Arrays;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {
		//1. first way to use stream
		List<String>obj=Arrays.asList("Raj","Om","Deeptid");
		obj.stream().map(i->i.toUpperCase()).forEach(i->System.out.print(i+" "));

	}

}
