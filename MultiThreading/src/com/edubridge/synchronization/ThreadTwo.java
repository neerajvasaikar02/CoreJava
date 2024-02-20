package com.edubridge.synchronization;

public class ThreadTwo extends Thread{
	SynchronizationMethod m2;

public ThreadTwo(SynchronizationMethod m2) {
	super();
	this.m2 = m2;
	
}
public void run()
{
	m2.print(8);
}
}
