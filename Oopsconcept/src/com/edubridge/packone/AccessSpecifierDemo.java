package com.edubridge.packone;
/*program to demonstrate on public, private and default access specifier*/
public class AccessSpecifierDemo {

	private int atm_pinNo;
	public String emailId;
	float percentage;
	
	private void displaypinNo() 
	{
		System.out.println(atm_pinNo);
	}
	public void displayemaiId() 
	{
		System.out.println(emailId);
	}
	void displaypercentage() 
	{
		System.out.println(percentage);
	}

}
