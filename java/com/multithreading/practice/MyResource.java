package com.multithreading.practice;

public class MyResource {

	public void atmWithdrawl(){
		for(int i = 0 ; i<10; i++){
			Thread.yield();
			System.out.println("This Methdo Is - ATM WITHDRAWL " + Thread.currentThread().getName());
		}	
	}
	
	public void notifyUser(){
		for(int i = 0; i <= 10; i++ ){
			//Thread.yield();
			System.out.println("The methdo For -  Notify The User " + Thread.currentThread().getName());
		}	
	}
	
	public static void main(String[] args) {
		MyResource resObj = new MyResource();
		MyThread t1 = new MyThread(resObj);
		//t1.setPriority(13);//java.lang.IllegalArgumentException
		t1.start(); 
		//t1.start();//java.lang.IllegalThreadStateException
		t1.setName("WithDrawl");
		MyThread t2 = new MyThread(resObj);
		t2.start();
		t2.setName("NotifyUser");
	}
	
}
class MyThread extends Thread {
	MyResource resource;
	public MyThread(MyResource obj){
		resource = obj;
	}
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("WithDrawl"))
			resource.atmWithdrawl();
		else
			resource.notifyUser();
	}
	
}



