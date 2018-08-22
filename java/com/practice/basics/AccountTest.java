package com.practice.basics;

public class AccountTest {
	public static void main(String[] args) {
		Account acc = new Account();
		acc.insert(390012, "Gunavardhan", 4000);
		acc.display();
		acc.withdraw(2500);
		acc.balanceAmt();
		acc.deposit(6000);
		acc.balanceAmt();
		acc.withdraw(2500);
		acc.balanceAmt();
	}
}
