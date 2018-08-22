package com.main;

import com.exceptionhandling.TestExc1;
import com.service.User;
import com.service.impl.UserImpl;

public class Main {
	public static void main(String[] args) {
		try{
			Main main = new Main();
			main.interfaceTest();
			main.testException();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	private void interfaceTest() {
		User user = new UserImpl();
		user.printName();
		int res = user.sum(20, 30);
		System.out.println("SUM: " +res);
		int mul = user.mul(20, 10);
		System.out.println("MULTIPLICATION: " +mul);
	}
	private void testException(){
		TestExc1 et= new TestExc1();
		et.printExcDetails();
	}
}
