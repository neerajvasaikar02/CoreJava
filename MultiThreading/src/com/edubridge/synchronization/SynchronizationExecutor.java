package com.edubridge.synchronization;

public class SynchronizationExecutor {

	public static void main(String[] args) {
		SynchronizationMethod m =new SynchronizationMethod();
		ThreadOne t1=new ThreadOne(m);
		ThreadTwo t2=new ThreadTwo(m);
		t1.start();
		t2.start();
		

	}

}
