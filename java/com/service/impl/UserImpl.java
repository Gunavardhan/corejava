package com.service.impl;

import com.service.User;

public class UserImpl implements User{

	public void printName() {
		System.out.println("This is Gunavardhan");
	}

	public int sum(int val1, int val2) {
		int sum = val1 + val2;
		return sum;
	}
	public int mul(int val1, int val2) {
		int mul = val1 * val2;
		return mul;
	}
}
