package com.edubridge.assignment;

import java.util.Scanner;

public class RemoveTheOccurrence {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	//String n = s.next();
	
	
	/*StringTokenizer str = new StringTokenizer(s.nextLine());
	while(str.hasMoreTokens())
	{
		System.out.printf(str.nextToken()+" ");
		System.out.println(str);
		}*/
	
	String str = s.nextLine();
	System.out.println(str.replaceAll("the",""));
	 

	}

}
