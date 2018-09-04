package com.practice.scjptest;

public class Test1 {
	
	public static void main(String[] args) {
		String str = null;
        if (str == null) {
            System.out.print("1");
        } else if(str.length() == 0) {
            System.out.print("2");
        } else {
            System.out.print("3");
        }
	}
}
