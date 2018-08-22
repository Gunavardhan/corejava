package com.practice.basics;

public class Account {
	int accNo;
	String name;
	float amount;
	
	void insert(int accNo, String name, float amount){
		this.accNo = accNo;
		this.name = name;
		this.amount = amount;				
	}
	void deposit(float depAmount){
		amount += depAmount;
		System.out.println("Deposited Amount: " +depAmount);
	}
	void withdraw(float amt){
		if(amount<amt){
			System.out.println("Insuffient Balance");
		}else{
			amount -= amt;
			System.out.println("Withdrawn AMount: " + amt);
		}
	}
	void balanceAmt(){
		System.out.println("Balance Amount is: "+amount);
	}
	void display(){
		System.out.println("ACC No: " + accNo +" Name: "+ name + " ACCOUNT BLNC: " + amount);
	}
}
