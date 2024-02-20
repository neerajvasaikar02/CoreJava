package com.edubridge.synchronization;

public class SynchronizedBlockDemo {

	public static void main(String[] args) {
		Flat f = new Flat();
		BlockA a = new BlockA(f);
		BlockB b = new BlockB(f);
		a.start();
		b.start();

	}

}
