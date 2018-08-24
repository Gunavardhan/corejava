package com.practice.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ALvsLL {
	public static void main(String[] args) {
		List<Object> arrayList = new ArrayList<>();
		List<Object> linkedList = new LinkedList<>();

		// ArrayList add
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
		arrayList.add(i);
		}
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("ArrayList add:  " + duration);
		
		// LinkedList add
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
		linkedList.add(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("LinkedList add: " + duration);

		// ArrayList get
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
		arrayList.get(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("ArrayList get:  " + duration);

		// LinkedList get
		startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
		linkedList.get(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("LinkedList get: " + duration);


		// ArrayList remove
		startTime = System.currentTimeMillis();

		for (int i = 9999; i >=0; i--) {
		arrayList.remove(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("ArrayList remove:  " + duration);

		// LinkedList remove
		startTime = System.currentTimeMillis();

		for (int i = 9999; i >=0; i--) {
		linkedList.remove(i);
		}
		endTime = System.currentTimeMillis();
		duration = endTime - startTime;
		System.out.println("LinkedList remove: " + duration);
	}

}
