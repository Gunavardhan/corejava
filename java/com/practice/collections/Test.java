package com.practice.collections;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<Object> ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(2, 4);
		ll.add(3);
		ll.add(9);
		System.out.println(ll.get(2));
		System.out.println(ll);
	}
}
