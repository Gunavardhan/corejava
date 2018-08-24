package com.practice.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestMap {

	public static void main(String[] args) {
		
		List<Integer> list=new CopyOnWriteArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		for (Integer val : list) { //expecteModCount=3, actualMod=4
			System.out.println(val);
			list.add(100);
		}
		
		System.out.println(list);
		/*Map<Integer, String> map=new HashMap<>();
		map.put(10, "Surya");
		map.put(13, "Prasad");
		map.put(20, "Abhinav");
		
		Set<Integer> keys = map.keySet();
		
		for (Integer key : keys) {
			System.out.println(key);
			
			map.put(25, "Srikanth");
		}
		
		System.out.println(map);
*/	}
}
