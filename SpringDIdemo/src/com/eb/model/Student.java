package com.eb.model;

public class Student {

	private int id;
	private String sname;
	private Course course;//aggregation
	public Student() {
		super();
		
	}
	public Student(int id, String name, Course course) {
		super();
		this.id = id;
		this.sname = name;
		this.course = course;
	}
	public void disp() {
		System.out.println(id+" "+sname);
		System.out.println(course.toString());
	}
}
