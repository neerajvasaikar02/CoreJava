package com.edubridge.synchronization;

public class Welcome {

	synchronized static void display(String str)
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("Welcome to Edubridge");
			System.out.println(str);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
