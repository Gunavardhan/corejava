package com.practice.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class First {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		Integer set = list.set(1, 40);
		System.out.println(set);
		System.out.println(list);
		System.out.println("========================");
		Set<Object> hashSet = new HashSet<>();
		hashSet.addAll(list);
		System.out.println(hashSet);
	}
	
}
