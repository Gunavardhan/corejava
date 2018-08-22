package com.test.inheritance;

public class A {
	int a = 10; int b = 20;
	{
		System.out.println(1);
	}
	/*A(){
		
	}*/
	String s ="Class -A";
	public A(int i, int j) {
		System.out.println("A Class Constructor : " + (i + j));
	}
	int m1(int a, int b){
		return a*b;
	}
	
}
