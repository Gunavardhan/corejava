package com.multithreading.practice;

public class Sender {

	public void send(String msg){
		synchronized (this) {
			System.out.println("Sending : " + msg);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("\n" + msg + " Sent");
		}
	}
	
	public static void main(String[] args) {
		Sender sender = new Sender();
		MyOwnThread sen1 = new MyOwnThread("HI", sender);
		MyOwnThread sen2 = new MyOwnThread("Bye", sender);
		sen1.setName("Hi thread");
		sen2.setName("Bye thread");
		sen1.start();
		sen2.start();
		try{
			//sen1.join();
			//sen2.join();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Interrupted");
		}
	}
}

class MyOwnThread extends Thread{
	private String msg;
	Sender sender;
	public MyOwnThread(String  msg,Sender sender) {
		this.msg = msg;
		this.sender = sender;
	}
	
	@Override
	public void run() {
			sender.send(msg + " - Thread Name : " + Thread.currentThread().getName());
	}
}

