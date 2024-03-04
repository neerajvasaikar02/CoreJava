package com.edubridge.designpattern;

class BOI implements Plan{

	@Override
	public void getROI(double rate) {
		System.out.println("The Rate of Interest for BOI : "+rate+"%");
	}	
}
	
	class SBI implements Plan{

		@Override
		public void getROI(double rate) {
			System.out.println("The Rate of Interest for SBI : "+rate+"%");
			
		}
}
	class BOB implements Plan{

			@Override
			public void getROI(double rate) {
				System.out.println("The Rate of Interest for BOB : "+rate+"%");
				
			}
}
public class TestOne {
	public static void main(String[]args) {
		BOB b1=new BOB();
		b1.getROI(88.2);
		
		BOI b2=new BOI();
		b2.getROI(54.2);
	}
}


