package com.edubridge.polymorphism;


class Stocks
{
	String shareName;
	long shareprice;
	String shareType;
	
	public static void displayStockDetails(String shareName,long sharePrice)
	{
		System.out.println(shareName+" "+sharePrice);
	}
		public static void displayStockDetails(String shareName,String shareType)
		{
			System.out.println(shareName+" "+shareType);
	    }
}
public class MethodOverloading {

	public static void main(String[] args) {
		Stocks.displayStockDetails("Tata", "8900");
		Stocks.displayStockDetails("Tata", "Nifty-Fifty");
	}

}
