package com.edubridge.abstractclassdemo;
//implementable class or child class
public class ISRO extends GovernmentAgency {
	
	void  displayDetails() {
		System.out.println("Indian Space Research"+"Organization");
	}

	@Override
	void displayDetails(String agencyName, long budget) {
		// TODO Auto-generated method stub
		System.out.println("agencyName :"+agencyName +"budget:"+budget);
		
	}
	
}
	

