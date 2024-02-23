package com.edubridge.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Product implements Comparable<Product>{
	private String pname;
	private int price;
	private int rating;
	
	@Override
	public int compareTo( Product o) {
		// TODO Auto-generated method stub
		return this.price - o.price ;
	}
	
public Product(String pname, int price, int rating) {
		super();
		this.pname = pname;
		this.price = price;
		this.rating = rating;
	}

public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

public static void main(String[] args) {
		ArrayList<Product>list=new ArrayList<Product>();
		
		list.add(new Product("speakers",100,4));
		list.add(new Product("car",5000,1));
		list.add(new Product("car",50,2));
		list.add(new Product("mouse",50,3));
		Collections.sort(list);
		for(Product p1:list) {
			System.out.println("Product Name:"+p1.getPname()+"\nProduct price : "+p1.getPrice()+"\nProduct Rating : "+p1.getRating());
		}
		System.out.println("Comparing ratings by comp");
		RatingCompare r=new RatingCompare();
		Collections.sort(list,r);
		for(Product pp:list) {
		System.out.println("Product Name:"+pp.getPname()+"\nProduct price : "+pp.getPrice()+"\nProduct Rating : "+pp.getRating());
	}
}
}
