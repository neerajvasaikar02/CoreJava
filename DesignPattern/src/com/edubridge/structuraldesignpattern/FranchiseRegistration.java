package com.edubridge.structuraldesignpattern;

public class FranchiseRegistration {

	Franchise KFC;
	Franchise Macdonalds;;
	Franchise Dominos;
	
	public FranchiseRegistration () {
		KFC=new KFC();
		Macdonalds=new Macdonalds();
		Dominos=new Dominos();
	}
	public void BuyKFC() {
		KFC.Option();
		KFC.Cost();
	}
	public void BuyMacDonalds() {
		Macdonalds.Option();
		Macdonalds.Cost();
	}
	public void BuyDominos() {
		Dominos.Option();
		Dominos.Cost();
	}
	}
	

