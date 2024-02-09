package com.edubridge.uncheckedexception;

import java.io.IOException;
import java.util.Scanner;

/*program to demonstrate on throw and throws keyword*/
public class ThrowKeyword {
/*throws keyword is used to declare a checked exception*/
	public static void donate(int age, int weight) throws IOException
	{
		if(age>18 && weight>45)
			System.out.println("eligible to donate the blood");
		else
			/*throw keyword is used to throw an exception explicitly*/
			throw new IOException("Not Eligible");
			
	}
	public static void main(String[] args) throws IOException {
		Scanner s=new Scanner(System.in);
		int age = s.nextInt();
		int weight = s.nextInt();
		try {
			ThrowKeyword.donate(age, weight);
		}
		catch(IOException e)
		{
		System.out.println(e);
		}
		s.close();

	}

}
