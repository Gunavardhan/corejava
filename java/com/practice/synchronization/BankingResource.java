package com.practice.synchronization;

public class BankingResource {
	
	int amount = 0;
	
	public void cashDepost(){
		System.out.println(Thread.currentThread().getName() + " - Cash Depositing Into Account");
		
		try {
			Thread.sleep(1000 * 5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (this) {
			amount += 1000;
			System.out.println("Deposited Amount Is :  " + amount);
			notify();
		}
		
	}
	
	public void cashWithdrawl(){
		System.out.println( Thread.currentThread().getName() + " - Cash Withdral from Account threw Atm");
		
		synchronized (this) {
			try {
				System.out.println("Waiting For Nofification ::");
				wait();
				System.out.println("Notification Came to withdrwal waiting person at atm");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			amount -=1000;
			System.out.println("Withdrawl Amount is :  " +amount);
		}
		
	}
	public static void main(String[] args) {
		
		BankingResource resObj1 = new BankingResource();
		MyOwnThread1 mt1 = new MyOwnThread1(resObj1);
		mt1.start();
		mt1.setName("CashDeposit - ");
		
		try {
			Thread.sleep(1000 * 2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		MyOwnThread2 mt2 = new MyOwnThread2(resObj1);
		mt2.start();
		mt2.setName("Withdrawl - ");
		
	}
	
}
class MyOwnThread1 extends Thread{
	
	BankingResource resObj;
	
	public MyOwnThread1(BankingResource resObj) {
		this.resObj = resObj;
	}

	@Override
	public void run() {
		resObj.cashDepost();
	}
}
class MyOwnThread2 extends Thread{
	BankingResource resObj;
	
	public MyOwnThread2(BankingResource resObj) {
		this.resObj = resObj;
	}

	@Override
	public void run() {
		resObj.cashWithdrawl();
	}
}