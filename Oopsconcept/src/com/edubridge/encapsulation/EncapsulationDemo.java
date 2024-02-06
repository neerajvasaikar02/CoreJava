package com.edubridge.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		Customer c=new Customer();
		c.setBranch("Thane");
		c.setIfscCode("HDFC123456");
		c.setCustname("Neeraaj Vasaikar");
		c.setCustId(1239);
		c.setPinno(4567);
		System.out.println(c.getBranch());
		System.out.println(c);
	}

}
