package com.practice.collections;

public class StaticWithNullArg {

	public static Integer method(Integer value){
		System.out.println("Value is  : " + value);
		return value;
	}
	public static void main(String[] args) {
		StaticWithNullArg st = null;
		Integer i = 10;
		st.method(i);//method calling with null reference
	}
}
