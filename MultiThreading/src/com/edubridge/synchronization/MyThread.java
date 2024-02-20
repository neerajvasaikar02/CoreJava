package com.edubridge.synchronization;

public class MyThread extends Thread {
Welcome w;

public MyThread(Welcome w) {
	super();
	this.w = w;
}
public void run()
{
	Welcome.display(getName());
}
}
