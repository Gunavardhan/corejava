package com.practice.collections;

import java.util.HashSet;

public class TestHashSet {
	
	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<>(10, 0.5f); 
		hs.add(25);
		hs.add(30);
		hs.add(40);
		hs.add(31);
		hs.add(9);
		hs.add(37);
		hs.add(39);
		hs.add(40);
		Boolean add = hs.add(new String("Hello"));
		int x = add.hashCode();
		System.out.println(x);
		
		
	}

}
