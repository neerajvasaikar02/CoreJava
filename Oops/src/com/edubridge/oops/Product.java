package com.edubridge.oops;

public class Product {
	String pname;
	int price;
	
	void disp(String p,int p1) {
		
		pname=p;
		price=p1;
		
		System.out.println("Product Name:"+pname+"\nProduct Price:"+price);
	}
	
	public static void main(String[] args) {
		Product p=new Product();
		p.disp("Speaker", 2000);
		p.disp("Hp Laptop", 50000);
		p.disp("Shoes", 400);
	}

}
