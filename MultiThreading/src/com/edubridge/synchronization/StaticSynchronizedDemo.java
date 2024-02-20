package com.edubridge.synchronization;

public class StaticSynchronizedDemo {

	public static void main(String[] args) {
		Welcome w1 = new Welcome();
		MyThread m1 = new MyThread(w1);
		MyThread m2 = new MyThread(w1);
		m2.setPriority(10);
		m1.setPriority(1);
		m1.start();
		m2.start();

	}

}
