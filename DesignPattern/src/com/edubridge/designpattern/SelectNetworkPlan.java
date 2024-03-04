package com.edubridge.designpattern;

public class SelectNetworkPlan {
	
	public CellularPlan getPlan(String planType) {
		
		if(planType==null) {
			return null;
		}
		if(planType.equalsIgnoreCase("abcNetwork")) {
			return new AbcNetwork();
		}
		else if(planType.equalsIgnoreCase("xyzNetwork")) {
			return new XyzNetwork();
		}
		
		return null;
	}

}
