package com.edubridge.finaldemo;
//child class
/*we can't inherit the final class*/
public class Passport extends Card {
	
	private final String passportno="IND66778899";
	private String dateofexpiry;
	public String getDateofexpiry() {
		return dateofexpiry;
	}
	public void setDateofexpiry(String dateofexpiry) {
		this.dateofexpiry = dateofexpiry;
	}
	public String getPassportno() {
		return passportno;
	}
	@Override
	public String toString() {
		return "Passport [passportno=" + passportno + ", dateofexpiry=" + dateofexpiry + ", toString()="
				+ super.toString() + "]";
	}
	
}
