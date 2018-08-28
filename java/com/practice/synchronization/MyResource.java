package com.practice.synchronization;

public class MyResource {
	String s = "hello";
	public void method1(){
		System.out.println("This is method1 : --  " + Thread.currentThread().getName());
		synchronized (s) {
			System.out.println("Entered into synchronized Block - methdo1 -- :: --  " +  Thread.currentThread().getName());
			try {
				Thread.sleep(1000 * 10);
				//wait(1000 * 20);
				System.out.println("Dhoni");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("HI ::  " + Thread.currentThread().getName());
			System.out.println("==========================================");
			System.out.println();
		}
	}
	public void method2(){
		System.out.println("This is method2 : -- " +  Thread.currentThread().getName());
		synchronized (s) {
			//notify();
			System.out.println("Entered into Synchronized block - method2  : " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000 * 10);
				System.out.println("Gunavardhan");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hello ::  " + Thread.currentThread().getName());
		}
	}
	
	public void method3(){
		System.out.println("This is method3 : --  " + Thread.currentThread().getName());
		synchronized (s) {
			System.out.println("Entered into synchronized Block - methdo3 -- :: --  " +  Thread.currentThread().getName());
			try {
				Thread.sleep(1000 * 10);
				//wait(1000 * 20);
				System.out.println("Pawan");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Bye ::  " + Thread.currentThread().getName());
			System.out.println("==========================================");
			System.out.println();
		}
	}
	public void method4(){
		System.out.println("This is method4 : -- " +  Thread.currentThread().getName());
		synchronized (s) {
			//notify();
			System.out.println("Entered into Synchronized block - method4  : " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000 * 10);
				System.out.println("Virat");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Good Bye!! ::  " + Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
		MyResource resObj1 = new MyResource();
		MyResource resObj2 = new MyResource();
		MyOwnThread mt1 = new MyOwnThread(resObj1);
		mt1.setName("First");
		mt1.start();
		MyownThread2 mt2 = new MyownThread2(resObj1);
		mt2.setName("Second");
		mt2.start();
		MyOwnThread3 mt3 = new MyOwnThread3(resObj2);
		mt3.setName("Third");
		mt3.start();
		MyownThread4 mt4 = new MyownThread4(resObj2);
		mt4.setName("Fourth");
		mt4.start();
	}

}

class MyOwnThread extends Thread{
	MyResource resource;
	public MyOwnThread(MyResource resource) {
		this.resource = resource;
	}
	@Override
	public void run() {
		resource.method1();
	}
}
class MyownThread2 extends Thread{
	MyResource resource;
	public MyownThread2(MyResource resource) {
		this.resource = resource;
	}
	@Override
	public void run() {
		resource.method2();
	}
}
class MyOwnThread3 extends Thread{
	MyResource resource;
	public MyOwnThread3(MyResource resource) {
		this.resource = resource;
	}
	@Override
	public void run() {
		resource.method3();
	}
}
class MyownThread4 extends Thread{
	MyResource resource;
	public MyownThread4(MyResource resource) {
		this.resource = resource;
	}
	@Override
	public void run() {
		resource.method4();
	}
}
