package com.edubridge.finaldemo;
//parent class
/*we can't inherit the final class*/

public class Card {

	private String cardName;
	//final VAR must be initialize
	//private final String issuer;
	/*we can't set or change the final value of variable*/
	private final String issuer="GOI";
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getIssuer() {
		return issuer;
	}
	@Override
	public String toString() {
		return "Card [cardName=" + cardName + ", issuer=" + issuer + ", toString()=" + super.toString() + "]";
	}
	//wecan't override final method
	final void accept()
	{
	//x=45;
		System.out.println("Final Method");
		
	
	}
}