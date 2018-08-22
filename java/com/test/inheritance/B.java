package com.test.inheritance;

public class B extends A{
	String s = "Class-B";
	{
		System.out.println(super.s);
		System.out.println(2);
	}
	public B(){
		super(10,20);
		
		System.out.println(super.s);
		System.out.println("B CLass Con");
	}
	int m1(){
		return 2;
		
	}
}
