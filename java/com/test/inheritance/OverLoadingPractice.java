package com.test.inheritance;

public class OverLoadingPractice {
	
	public static void main(String[] args) {
		Test op = new Test();
		op.m1("hi");
		op.m1(10);
		op.m1(new Object());
		op.m1(null); //String is child for Object -- String arg
		op.m1(new StringBuffer(10));
	}
	
}
class Test{
	public void m1(String s){
		System.out.println("String arg");
	}
	public void m1(Object o){
		System.out.println("Object arg");
	}
	
}
