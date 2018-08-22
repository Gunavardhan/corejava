package com.exceptionhandling;

public class TryWithFinallyTest {
	public static void main(String[] args) {
		TryWithFinallyTest.print();
	}
	public static int print(){
		try{
			throw new NullPointerException();
		}finally{
			System.out.println("Executing finally block");
		}
	}
}
