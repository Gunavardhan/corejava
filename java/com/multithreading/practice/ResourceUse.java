package com.multithreading.practice;

public class ResourceUse {
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
		ResourceUse resObj1 = new ResourceUse();
		ResourceUse resObj2 = new ResourceUse();
		resObj1.method1();
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

class MyownThread2 extends Thread{
	ResourceUse resource;
	public MyownThread2(ResourceUse resource) {
		this.resource = resource;
	}
	@Override
	public void run() {
		resource.method2();
	}
}
class MyOwnThread3 extends Thread{
	ResourceUse resource;
	public MyOwnThread3(ResourceUse resource) {
		this.resource = resource;
	}
	@Override
	public void run() {
		resource.method3();
	}
}
class MyownThread4 extends Thread{
	ResourceUse resource;
	public MyownThread4(ResourceUse resource) {
		this.resource = resource;
	}
	@Override
	public void run() {
		resource.method4();
	}
}
