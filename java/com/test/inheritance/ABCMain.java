package com.test.inheritance;

public class ABCMain {
	public static void main(String[] args) {		
		C c = new C();
		System.out.println(c.s);
		int m1 = c.m1();
		System.out.println(m1);
		A a = new C();
		System.out.println(a.m1(10, 20));
	}
}
