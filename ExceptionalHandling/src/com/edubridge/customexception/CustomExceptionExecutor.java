package com.edubridge.customexception;

import java.util.Scanner;

public class CustomExceptionExecutor {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String email_id=s.next();
	String password=s.next();
	
	try
	{
		if(email_id.equals("trainer11@gmail.com") && password.equals("asdf23"))
			System.out.println("Login Successful");
		else
			throw new LoginCredentials("Invalid Credentials");
	}
	catch(LoginCredentials e)
	{
		System.out.println(e);
	}
	}

}
