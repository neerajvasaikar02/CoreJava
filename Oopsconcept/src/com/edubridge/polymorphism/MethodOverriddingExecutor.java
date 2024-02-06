package com.edubridge.polymorphism;

public class MethodOverriddingExecutor {

	public static void main(String[] args) {
	
		GoogleMeet g = new GoogleMeet();
		g.accept("Gmeet", "k@gmail.com");
		g.accept();
		System.out.println(g instanceof GoogleMeet);
	}

}
