package com.edubridge.assignment;

public class BankAccount {
int balance;
int amount;
int money;

   protected void deposit(int amount) {
	   this.amount=amount;
	   System.out.println("Amount to be deposited is "+amount);
   }
   void withdraw(int money,int balance) {
	   this.balance=balance;
	   this.money=money;
	   if(balance>100) {
		   System.out.println("\nWithdraw"+money);
	   }
	   else {
		   System.out.println("Your Balance is low");
	   }
   }
	public static void main(String[] args) {
		

	}

}
