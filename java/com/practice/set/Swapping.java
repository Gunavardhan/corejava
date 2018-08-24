package com.practice.set;

public class Swapping {
	static int temp = 0;
	public static void main(String[] args) {
		int a = 10;
		int b = 15;
		System.out.println( "a = " +a + " b = " +b);
		
		temp = a;
		a = b;
		b = temp;
		System.out.println(a  + " " +b);
	}
}
