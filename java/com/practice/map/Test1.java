package com.practice.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		Map<Object,Object> map = new HashMap<>();
		map.put(1, "Guna");
		map.put(2, "Vardhan");
		map.put(10, "Pawan");
		map.put(1,"Dhoni"); // override 1 key with value dhoni
		for(int key = 1; key <= map.size(); key++){
			if(key == 1){
				System.out.println("Printed from loop : " + map.get(key));
			}
		}
		System.out.println("Printer directly : " +map.get(2));
		System.out.println("Contains method : " + map.containsKey(10));
		Set<Object> keySet = map.keySet();
		for (int i = 1; i <= keySet.size(); i++) {
			
		}
		System.out.print("KEYS ARE : ");
		for (Object keys : map.keySet()) {
			System.out.print(keys + "  ");	
		}
		System.out.println("\n");
		
		Iterator<Object> iterator = map.keySet().iterator();
		System.out.println("**GETTING KEYS AND VALUES PIAR USING ITERATOT**");
		while(iterator.hasNext()){
			Object key = iterator.next();
			Object value = map.get(key);
			System.out.println(key + " : " + value);
			
		}
		System.out.println("**GETTING KEYS AND VALUES PIAR USING ENTRYSET**");
		
		Set<Entry<Object, Object>> st = map.entrySet();
		for (Entry<Object, Object> kv : st) {
			System.out.print(kv.getKey()+":");
			System.out.println(kv.getValue());
		}
		System.out.println();
		System.out.println("**GEETING KEY VALUES**");
		for (Object key : map.keySet()) {
			System.out.println(map.get(key));
		}
		
	}
}

/*http://www.techiedelight.com/iterate-map-using-keyset-java/*/