package com.eb.model;

public class Course {

	private int id;
	private String name;
	private String duration;
	private int price;
	public Course(int id, String name, String duration, int price) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.price = price;
	}
	
	public void disp() 
	{
		System.out.println(id + " "+ name+ " "+duration+" "+price);
		
	}
}
