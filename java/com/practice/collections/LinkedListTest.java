package com.practice.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<Object> ll = new LinkedList<>();
		ll.add(new Integer(10));
		ll.add(new Integer(40));
		ll.add("gv");
		ll.addLast(99);
		ll.add(2, new Integer(24));
		ll.add(2,new String("gua"));
		ll.addFirst("dhoni");
		
		System.out.println(ll);
		boolean isContain = ll.contains("gua");
		System.out.println(isContain);
		System.out.println(ll.get(2));
		
		
	}
}
