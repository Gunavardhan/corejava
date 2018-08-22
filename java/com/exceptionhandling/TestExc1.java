package com.exceptionhandling;

public class TestExc1 {
	static int count;
	public void printExcDetails(){
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	public static void setCount(int count)
    {	   System.out.println("COunt Number : " + count);
           if (count < 0)
                   throw new IllegalArgumentException("cont must not be negative");
           TestExc1.count = count;
     }
	
}
