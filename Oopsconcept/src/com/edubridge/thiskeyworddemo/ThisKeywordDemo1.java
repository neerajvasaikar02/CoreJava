package com.edubridge.thiskeyworddemo;
/*it can be used to refer instance variable of current class*/

class Account
{
	public String accType;
	public long accno;

	
	public void setData(String accType,long accno)
	{
		this.accType=accType;
		this.accno=accno;
	}

	public void display()
	{
		System.out.println(accType+accno);
	}
}
public class ThisKeywordDemo1 {

	public static void main(String[] args) {
		Account obj=new Account();
		obj.setData("Saving", 5678);
		obj.display();
	}
		
}


