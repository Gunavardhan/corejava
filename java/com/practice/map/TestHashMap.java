package com.practice.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class TestHashMap {
	public static void main(String[] args) {
		Map<Integer,String> hm = new HashMap<>();
		hm.put(1, "Hi");
		hm.put(4, "Hello");
		hm.put(9, "Hero");
		hm.put(11, "DIn");
		hm.put(4, "hey");
		hm.put(25, "bye");
		hm.put(2, "two");
		hm.put(5, "two");
		hm.put(8, "two");
		hm.put(3, "two");
		hm.put(6, "two");
		hm.put(7, "two");
		hm.put(12,"Roy");
		hm.put(13,"Zeeva");
		System.out.println(hm.size());
		
		Hashtable<Integer, String> hashtable = new Hashtable<>();
		hashtable.put(1, "Guna");
		hashtable.put(null, null);
	}
}
