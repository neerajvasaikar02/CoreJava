package com.edubridge.regularexpressiondemo;

public class StringSplitDemo {

	public static void main(String[] args) {
		String str = "Hey, Neeraj, Durvesh, Abhi";
		String[] res=str.split(",");
		for(String itr:res)
		{
			System.out.print(itr+" ");
		}
		System.out.println();
		String str1="There are 4 members in my family";
		String regex="\\d+";
		String res1=str1.replaceAll(regex, "four");
		System.out.println(res1);
			
		
		
	}

}
