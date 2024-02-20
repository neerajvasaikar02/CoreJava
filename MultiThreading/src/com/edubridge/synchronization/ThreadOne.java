package com.edubridge.synchronization;

public class ThreadOne extends Thread{

	SynchronizationMethod m1;
	
	public ThreadOne(SynchronizationMethod m1) {
		super();
		this.m1 = m1;
		
	}
	public void run()
	{
		m1.print(10);
	}
}
