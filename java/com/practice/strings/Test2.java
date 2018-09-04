package com.practice.strings;

public class Test2 {

	public static void main(String[] args) {
		String s1 = new String("chair");
		System.out.println(s1);
		String s2 = "chair";
		System.out.println(s2);
		String s3 = new String("chair");
		System.out.println(s3);
		final String s4 = "chair";
		System.out.println(s4.toUpperCase());
		String s5 = s4.toLowerCase();
		System.out.println(s5);
		String s6 = s5.toUpperCase();
		System.out.println(s6);
		String s7 = s5.toLowerCase();
		System.out.println(s7);
		String s8 = s6.toLowerCase();
		System.out.println(s8);
		String s9 = s4+"table";
		System.out.println(s9);
		String s10 = "chairtable";
		System.out.println(s10);
		String s11 = s2+"table";
		System.out.println(s11.toLowerCase());
		System.out.println(s1.intern() ==  s3.intern());
		System.out.println(s1.intern().equals(s3.intern()));
	}
	
}
