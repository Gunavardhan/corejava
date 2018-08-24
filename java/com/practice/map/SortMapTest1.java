package com.practice.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortMapTest1 {

	public static void main(String[] args) {
		HashMap<Object, String> hashMap = new HashMap<>();
		hashMap.put(12, new String());
		hashMap.put(34, "THREE_FOUR");
		hashMap.put(13, "Thirteen");
		hashMap.put(10, "Ten");
		hashMap.put(66, "SIX_SIX");
		hashMap.put(8, "Eight");
		hashMap.put(9, "Nine");
		hashMap.put(4, "Four");
		hashMap.put(3, "Three");
		hashMap.put(13, "Thir-teen");// overide
		hashMap.put(6, "SIX");
		System.out.println(hashMap.size() + ", " + hashMap);
		Set<Entry<Object, String>> entrySet = hashMap.entrySet();
		System.out.println("-------Befor Sorting KEY-------");
		for (Entry<Object, String> key : entrySet) {
			System.out.println(key.getKey() + " : " + key.getValue());
		}
		System.out.println();
		System.out.println("-------After Sorting Key -------");
		TreeMap<Object, Object> treeMap = new TreeMap<>(hashMap);
		Set<Entry<Object, Object>> entrySet2 = treeMap.entrySet();
		for (Entry<Object, Object> key : entrySet2) {
			System.out.println(key.getKey() + " : " + key.getValue());
		}

		System.out.println("---SORTING BY VALUES-----");

		HashMap<Object, Object> sortByValues = sortByValues(hashMap);
		System.out.println(sortByValues.size());
		for (Entry<Object, Object> entry : sortByValues.entrySet()) {
			System.out.println(entry.getKey() + " : " +entry.getValue());
		}
	}

	private static HashMap<Object, Object> sortByValues(HashMap<Object, String> map) { 
	       List<Object> list = new LinkedList<Object>(map.entrySet());
	       // Defined Custom Comparator here
	       Collections.sort(list, new Comparator<Object>() {
	            @SuppressWarnings({ "unchecked", "rawtypes" })
				public int compare(Object o1, Object o2) {
	               return ((Comparable<Object>) ((Map.Entry) (o1)).getValue())
	                  .compareTo(((Map.Entry) (o2)).getValue());
	            }
	       });

	       // Here I am copying the sorted list in HashMap
	       // using LinkedHashMap to preserve the insertion order
	       HashMap<Object, Object> sortedHashMap = new LinkedHashMap<Object, Object>();
	       for (Iterator<Object> it = list.iterator(); it.hasNext();) {
	              @SuppressWarnings("rawtypes")
				Map.Entry entry = (Map.Entry) it.next();
	              sortedHashMap.put(entry.getKey(), entry.getValue());
	       } 
	       return sortedHashMap;
	  }

}
