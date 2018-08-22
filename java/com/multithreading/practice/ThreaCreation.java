package com.multithreading.practice;

public class ThreaCreation extends Thread{
	
	public void task1(){
		for(int i = 1; i <= 3 ; i++){
			System.out.println("This methdo exection for - task1" +" Thread Name - " +Thread.currentThread().getName());
		}
	}
	public void task2(){
		for(int i = 1; i <= 3; i++){
			System.out.println("This methdo exection for - task2" +" Thread Name - " + Thread.currentThread().getName());
		}
	}
	@Override
	public void run() {
		task1();
		//task2();
	}
	public static void main(String[] args) {
		ThreaCreation obj = new ThreaCreation();
		obj.task2();
		obj.setName("MyOwn");
		obj.start();
	}
}
