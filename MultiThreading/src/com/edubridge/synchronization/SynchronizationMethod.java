package com.edubridge.synchronization;

public class SynchronizationMethod {

	public synchronized void print(int num)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(num*i);
			try {
				Thread.sleep(500);
			}catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	public static void main(String[] args) {
		
	}
}
