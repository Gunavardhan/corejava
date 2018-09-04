package com.practice.collections;

import java.util.ArrayList;
import java.util.List;

public class ListArray {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("four");
		System.out.println(list.size());
		
		String[] listToArray = list.toArray(new String[list.size()]);
		for (String string : listToArray) {
			System.out.println(string);
		}
	}
}
