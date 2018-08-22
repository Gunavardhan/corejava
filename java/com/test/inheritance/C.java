package com.test.inheritance;

public class C extends B{
	String s = "Class-C";
	{
		System.out.println(super.s);
		System.out.println(3);
	}
	C(){
		super();
	}
	int m1(){
		return 3;
	}
}
