package com.practice.set;

import java.util.HashSet;
import java.util.Set;

public class TestHashingBuckets {
	public static void main(String[] args) {
		System.out.println("HI");
		Set<Integer> set = new HashSet<>();
		set.add(4);
		set.add(8);
		set.add(9);
		set.add(25);
		set.add(4);
		set.add(30);
		set.add(31);
		set.add(12);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(5);
		set.add(7);
		set.add(10);
		System.out.println(set.size());
	}
}
