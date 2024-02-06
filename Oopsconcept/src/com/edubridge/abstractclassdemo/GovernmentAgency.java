package com.edubridge.abstractclassdemo;

public abstract class GovernmentAgency {
	
	private String agencyName;
	private long budget;
	
	//abstract method
	
	abstract void displayDetails();
	abstract void displayDetails(String agencyname, long budget);
	//Concrete Method
	String display() {
	
		return "Concrete Method";
	}
	public String getAgencyName() {
		return agencyName;

	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public long getBudget() {
		return budget;
	}
	public void setBudget(long budget) {
		this.budget = budget;
		
	}
	@Override
	public String toString() {
		return "GovernmentAgency [agencyName=" + agencyName + ", budget=" + budget + "]";
	}
	
	
}
